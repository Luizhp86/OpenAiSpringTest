package com.example.demo.model;

public class CteCamposResponse {
    private double valorFreteCte; //comp
    private double grisCte;
    private double advCte;
    private double pedagioCte;
    private double ajudanteCte;
    private double outrosCte;
    private String descricaoTag;
    private double escoltaCte;
    private double totalNfeCte;
    private double freteAdicionalCte;
    private double pesoBaseCalculoCte; //infq

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

    public double getTotalNfeCte() {
        return totalNfeCte;
    }

    public void setTotalNfeCte(double totalNfeCte) {
        this.totalNfeCte = totalNfeCte;
    }

    public double getFreteAdicionalCte() {
        return freteAdicionalCte;
    }

    public void setFreteAdicionalCte(double freteAdicionalCte) {
        this.freteAdicionalCte = freteAdicionalCte;
    }


    public double getPesoBaseCalculoCte() {
        return pesoBaseCalculoCte;
    }

    public void setPesoBaseCalculoCte(double pesoBaseCalculoCte) {
        this.pesoBaseCalculoCte = pesoBaseCalculoCte;
    }

    @Override
    public String toString() {
        return "CteCamposRoteiroResponse{" +
                ", valorFreteCte=" + valorFreteCte +
                ", grisCte=" + grisCte +
                ", advCte=" + advCte +
                ", pedagioCte=" + pedagioCte +
                ", ajudanteCte=" + ajudanteCte +
                ", outrosCte=" + outrosCte +
                ", descricaoTag='" + descricaoTag + '\'' +
                ", escoltaCte=" + escoltaCte +
                ", totalNfeCte=" + totalNfeCte +
                ", freteAdicionalCte=" + freteAdicionalCte +
                ", pesoBaseCalculoCte=" + pesoBaseCalculoCte +
                '}';
    }
}