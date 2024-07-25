package com.example.demo.services;

import com.example.demo.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class ConciliacaoAiService {

    private final Logger logger = LoggerFactory.getLogger(ConciliacaoAiService.class);

    private final OpenAiService openAiService;

    public ConciliacaoAiService(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    public String conciliarTags(@RequestBody MessageRequest messageRequest) {
        String tipoOperacao = messageRequest.getTipoOperacao();


        if ("ROTEIRO".equalsIgnoreCase(tipoOperacao)) {
            messageRequest.setTagsTipoServico(montarMensagemComTagsPorTipoOperacao(CteCamposEnum.TipoServico.ROTEIRO));
            CteCamposRoteiroResponse response = new CteCamposRoteiroResponse();
        } else if ("VIAGEM".equalsIgnoreCase(tipoOperacao)) {
            messageRequest.setTagsTipoServico(montarMensagemComTagsPorTipoOperacao(CteCamposEnum.TipoServico.VIAGEM));
            CteCamposViagemResponse response = new CteCamposViagemResponse();
        } else if ("PEDIDO".equalsIgnoreCase(tipoOperacao)) {
            messageRequest.setTagsTipoServico(montarMensagemComTagsPorTipoOperacao(CteCamposEnum.TipoServico.PEDIDO));
            CteCamposPedidoResponse response = new CteCamposPedidoResponse();
        } else {
            throw new IllegalArgumentException("Tipo de operação desconhecido: " + tipoOperacao);
        }

        messageRequest.setMessage("Tags recebidas = " + messageRequest.getTagsXml() +
                "; Tags conciliadas = " + messageRequest.getTagsTipoServico() +
                "resposta em JSON com as respectivas tags");


        openAiService.openAiChatConciliacao(messageRequest);


        //tratar resposta

        return "tags conciliadas";
    }

    private String montarMensagemComTagsPorTipoOperacao(CteCamposEnum.TipoServico tipoServico) {
        return Arrays.stream(CteCamposEnum.values()).findAny()
                .filter(campo -> campo.getTiposServicos().contains(tipoServico))
                .map(CteCamposEnum::getDisplayName)
                .stream().collect(Collectors.joining(", "));
    }
}