package com.example.demo.model;

public class MessageConciliacaoTagsRequest {
    private String message;
    private String tagsXml;
    private String tagsTipoServico;
    private String tipoOperacao;

    public String getTagsXml() {
        return tagsXml;
    }

    public void setTagsXml(String tagsXml) {
        this.tagsXml = tagsXml;
    }

    public String getTagsTipoServico() {
        return tagsTipoServico;
    }

    public void setTagsTipoServico(String tagsTipoServico) {
        this.tagsTipoServico = tagsTipoServico;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String montarMessage() {
        this.message = String.format(
                "Tipo de operação: %s; Tags recebidas = %s; Tags a serem interpretadas e conciliadas = %s; resposta em JSON; nome das tags em Camel Case; valor de cada tag de acordo com a concilicação",
                this.tipoOperacao, this.tagsXml, this.tagsTipoServico
        );
        return this.message;
    }
}