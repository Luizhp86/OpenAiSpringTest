package com.example.demo.model;

public class CteCamposResponse {
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
    private double totalNfeCte;
    private double freteAdicionalCte;
    private double aliquotaIcmsCte;
    private double valorIcms;
    private double pesoBaseCalculoCte;

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

    public double getAliquotaIcmsCte() {
        return aliquotaIcmsCte;
    }

    public void setAliquotaIcmsCte(double aliquotaIcmsCte) {
        this.aliquotaIcmsCte = aliquotaIcmsCte;
    }

    public double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(double valorIcms) {
        this.valorIcms = valorIcms;
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
                ", totalNfeCte=" + totalNfeCte +
                ", freteAdicionalCte=" + freteAdicionalCte +
                ", aliquotaIcmsCte=" + aliquotaIcmsCte +
                ", valorIcms=" + valorIcms +
                ", pesoBaseCalculoCte=" + pesoBaseCalculoCte +
                '}';
    }
}