package com.example.demo.model;

public class CteCamposRoteiroResponse {
    private double freteTotalCte;
    private double valorMercadoriaCte;
    private double valorFreteCte;
    private double grisCte;
    private double advCte;
    private double pedagioCte;
    private double ajudanteCte;
    private double outrosCte;
    private String descricaoTag;
    private double escoltaCte;

    public double getFreteTotalCte() {
        return freteTotalCte;
    }

    public void setFreteTotalCte(double freteTotalCte) {
        this.freteTotalCte = freteTotalCte;
    }

    public double getValorMercadoriaCte() {
        return valorMercadoriaCte;
    }

    public void setValorMercadoriaCte(double valorMercadoriaCte) {
        this.valorMercadoriaCte = valorMercadoriaCte;
    }

    public double getValorFreteCte() {
        return valorFreteCte;
    }

    public void setValorFreteCte(double valorFreteCte) {
        this.valorFreteCte = valorFreteCte;
    }

    public double getGrisCte() {
        return grisCte;
    }

    public void setGrisCte(double grisCte) {
        this.grisCte = grisCte;
    }

    public double getAdvCte() {
        return advCte;
    }

    public void setAdvCte(double advCte) {
        this.advCte = advCte;
    }

    public double getPedagioCte() {
        return pedagioCte;
    }

    public void setPedagioCte(double pedagioCte) {
        this.pedagioCte = pedagioCte;
    }

    public double getAjudanteCte() {
        return ajudanteCte;
    }

    public void setAjudanteCte(double ajudanteCte) {
        this.ajudanteCte = ajudanteCte;
    }

    public double getOutrosCte() {
        return outrosCte;
    }

    public void setOutrosCte(double outrosCte) {
        this.outrosCte = outrosCte;
    }

    public String getDescricaoTag() {
        return descricaoTag;
    }

    public void setDescricaoTag(String descricaoTag) {
        this.descricaoTag = descricaoTag;
    }

    public double getEscoltaCte() {
        return escoltaCte;
    }

    public void setEscoltaCte(double escoltaCte) {
        this.escoltaCte = escoltaCte;
    }

    // toString
    @Override
    public String toString() {
        return "CteCamposRoteiroRequest{" +
                "freteTotalCte=" + freteTotalCte +
                ", valorMercadoriaCte=" + valorMercadoriaCte +
                ", valorFreteCte=" + valorFreteCte +
                ", grisCte=" + grisCte +
                ", advCte=" + advCte +
                ", pedagioCte=" + pedagioCte +
                ", ajudanteCte=" + ajudanteCte +
                ", outrosCte=" + outrosCte +
                ", descricaoTag='" + descricaoTag + '\'' +
                ", escoltaCte=" + escoltaCte +
                '}';
    }
}