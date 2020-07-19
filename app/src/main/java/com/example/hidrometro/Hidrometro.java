package com.example.hidrometro;

import java.text.DateFormat;
import java.util.Date;

public class Hidrometro {

    private Date data;
    private int leituraInicial;
    private int leituraFinal;

    public Hidrometro() {

    }

    public Hidrometro(Date data, int leituraInicial, int leituraFinal) {
        this.data = data;
        this.leituraInicial = leituraInicial;
        this.leituraFinal = leituraFinal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLeituraFinal(int leituraFinal) {
        this.leituraFinal = leituraFinal;
    }

    public int getLeituraInicial() {
        return leituraInicial;
    }

    public int getLeituraFinal() {
        return leituraFinal;
    }

    public void setLeituraInicial(int leituraInicial) {
        this.leituraInicial = leituraInicial;
    }

    @Override
    public String toString() {
        DateFormat formataData = DateFormat.getDateInstance();
        return formataData.format(getData()) + " - " + (getLeituraFinal()-getLeituraInicial()+" m³");
    }
}