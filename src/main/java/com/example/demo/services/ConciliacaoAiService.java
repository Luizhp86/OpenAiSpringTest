package com.example.demo.services;

import com.example.demo.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ConciliacaoAiService {

    private final Logger logger = LoggerFactory.getLogger(ConciliacaoAiService.class);

    private final OpenAiService openAiService;
    private final ObjectMapper objectMapper;

    public ConciliacaoAiService(OpenAiService openAiService, ObjectMapper objectMapper) {
        this.openAiService = openAiService;
        this.objectMapper = objectMapper;
    }

    public String conciliarTags(@RequestBody MessageRequest messageRequest) throws JsonProcessingException {


        if ("ROTEIRO".equalsIgnoreCase(messageRequest.getTipoOperacao())) {
            messageRequest.setTagsTipoServico(buscarTagsPorTipoServico(CteCamposEnum.TipoServico.ROTEIRO));
        } else if ("VIAGEM".equalsIgnoreCase(messageRequest.getTipoOperacao())) {
            messageRequest.setTagsTipoServico(buscarTagsPorTipoServico(CteCamposEnum.TipoServico.VIAGEM));
        } else if ("PEDIDO".equalsIgnoreCase(messageRequest.getTipoOperacao())) {
            messageRequest.setTagsTipoServico(buscarTagsPorTipoServico(CteCamposEnum.TipoServico.PEDIDO));
        } else {
            throw new IllegalArgumentException("Tipo de operação desconhecido: " + messageRequest.getTipoOperacao());
        }

        messageRequest.setMessage("Tipo de operação: " + messageRequest.getTipoOperacao() + "; " +
                "Tags recebidas = " + messageRequest.getTagsXml() + "; " +
                "Tags a serem interpretadas e conciliadas = " + messageRequest.getTagsTipoServico() + "; " +
                "resposta em JSON com o nome da tag em Camel Case e o valor da tag de acordo com a concilicação");

        String jsonResponse = openAiService.openAiChatConciliacao(messageRequest);

        CteCamposResponse response = objectMapper.readValue(jsonResponse, CteCamposResponse.class);

        return response.toString();
    }

    private String buscarTagsPorTipoServico(CteCamposEnum.TipoServico tipoServico) {
        return Stream.of(CteCamposEnum.values())
                .filter(campo -> campo.getTiposServicos().contains(tipoServico))
                .map(CteCamposEnum::getDisplayName)
                .collect(Collectors.joining(", "));
    }
}