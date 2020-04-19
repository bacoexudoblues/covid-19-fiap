package com.company.model;

public class DadosSintomas {

    private boolean tosseSeca;

    private boolean febre;

    private boolean cansaco;

    private boolean dificuldadeRespiracao;



    public boolean getCansaco() {
        return cansaco;
    }

    public void setCansaco(boolean cansaco) {
        this.cansaco = cansaco;
    }


    public boolean isDificuldadeRespiracao() {
        return dificuldadeRespiracao;
    }



    public boolean getTosseSeca() {
        return tosseSeca;
    }

    public void setTosseSeca(boolean tosseSeca) {
        this.tosseSeca = tosseSeca;
    }

    public boolean getFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

    public boolean getDificuldadeRespiracao() {
        return dificuldadeRespiracao;
    }

    public void setDificuldadeRespiracao(boolean dificuldadeRespiracao) {
        this.dificuldadeRespiracao = dificuldadeRespiracao;
    }
}
