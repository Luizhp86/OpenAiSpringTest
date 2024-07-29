package com.example.demo.services;

import com.example.demo.model.CteCamposEnum;
import com.example.demo.model.CteCamposResponse;
import com.example.demo.model.MessageConciliacaoTagsRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ConciliacaoAiService {

    private static final Logger logger = LoggerFactory.getLogger(ConciliacaoAiService.class);
    private static final String MODELO = "ft:gpt-3.5-turbo-1106:asap-log:testeconciliacao:9ovURXiB";

    private final OpenAiService openAiService;
    private final ObjectMapper objectMapper;

    public ConciliacaoAiService(OpenAiService openAiService, ObjectMapper objectMapper) {
        this.openAiService = openAiService;
        this.objectMapper = objectMapper;
    }

    public String conciliarTags(MessageConciliacaoTagsRequest request) throws JsonProcessingException {
        request.setTagsTipoServico(buscarTagsPorTipoServico(request.getTipoOperacao()));
        String jsonResponse = openAiService.openAiChat(request.montarMessage(), MODELO);
        CteCamposResponse response = objectMapper.readValue(jsonResponse, CteCamposResponse.class);
        return response.toString();
    }

    private String buscarTagsPorTipoServico(String tipoOperacao) {
        CteCamposEnum.TipoServico tipoServico;
        switch (tipoOperacao.toUpperCase()) {
            case "ROTEIRO":
                tipoServico = CteCamposEnum.TipoServico.ROTEIRO;
                break;
            case "VIAGEM":
                tipoServico = CteCamposEnum.TipoServico.VIAGEM;
                break;
            case "PEDIDO":
                tipoServico = CteCamposEnum.TipoServico.PEDIDO;
                break;
            default:
                throw new IllegalArgumentException("Tipo de operação desconhecido: " + tipoOperacao);
        }
        return Stream.of(CteCamposEnum.values())
                .filter(campo -> campo.getTiposServicos().contains(tipoServico))
                .map(CteCamposEnum::getDisplayName)
                .collect(Collectors.joining(", "));
    }
}