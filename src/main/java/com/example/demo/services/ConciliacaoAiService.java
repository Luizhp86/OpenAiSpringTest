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

    public String conciliarTags(@RequestBody MessageConciliacaoTagsRequest messageConciliacaoTagsRequest) throws JsonProcessingException {

        String modelo = "ft:gpt-3.5-turbo-1106:asap-log:testeconciliacao:9ovURXiB";

        if ("ROTEIRO".equalsIgnoreCase(messageConciliacaoTagsRequest.getTipoOperacao())) {
            messageConciliacaoTagsRequest.setTagsTipoServico(buscarTagsPorTipoServico(CteCamposEnum.TipoServico.ROTEIRO));
        } else if ("VIAGEM".equalsIgnoreCase(messageConciliacaoTagsRequest.getTipoOperacao())) {
            messageConciliacaoTagsRequest.setTagsTipoServico(buscarTagsPorTipoServico(CteCamposEnum.TipoServico.VIAGEM));
        } else if ("PEDIDO".equalsIgnoreCase(messageConciliacaoTagsRequest.getTipoOperacao())) {
            messageConciliacaoTagsRequest.setTagsTipoServico(buscarTagsPorTipoServico(CteCamposEnum.TipoServico.PEDIDO));
        } else {
            throw new IllegalArgumentException("Tipo de operação desconhecido: " + messageConciliacaoTagsRequest.getTipoOperacao());
        }

        String jsonResponse = openAiService.openAiChat(messageConciliacaoTagsRequest.montarMessage(), modelo);

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