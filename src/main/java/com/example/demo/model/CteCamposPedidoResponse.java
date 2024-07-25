package com.example.demo.model;

public class CteCamposPedidoResponse {
    private double freteTotalCte;
    private double totalNfeCte;
    private double valorFreteCte;
    private double grisCte;
    private double advCte;
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

    public double getTotalNfeCte() {
        return totalNfeCte;
    }

    public void setTotalNfeCte(double totalNfeCte) {
        this.totalNfeCte = totalNfeCte;
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

    // toString
    @Override
    public String toString() {
        return "CteCamposPedidoRequest{" +
                "freteTotalCte=" + freteTotalCte +
                ", totalNfeCte=" + totalNfeCte +
                ", valorFreteCte=" + valorFreteCte +
                ", grisCte=" + grisCte +
                ", advCte=" + advCte +
                ", freteAdicionalCte=" + freteAdicionalCte +
                ", aliquotaIcmsCte=" + aliquotaIcmsCte +
                ", valorIcms=" + valorIcms +
                ", pesoBaseCalculoCte=" + pesoBaseCalculoCte +
                '}';
    }
}