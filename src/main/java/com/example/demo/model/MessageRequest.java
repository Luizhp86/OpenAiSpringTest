package com.example.demo.model;

public class MessageRequest {
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
}