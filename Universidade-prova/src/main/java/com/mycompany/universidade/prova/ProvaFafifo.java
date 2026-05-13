package com.mycompany.universidade.prova;

public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo() {
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 3;
        this.mediaMinima = 6;
    }

    @Override
    public double calcularMedia() {
        if (realizouProvaFinal) {
            // Soma a AV3 (com peso 3) na média ponderada
            return ((av1 * pesoAv1) + (av2 * pesoAv2) + (av3 * pesoAv3)) / (pesoAv1 + pesoAv2 + pesoAv3);
        }
        return ((av1 * pesoAv1) + (av2 * pesoAv2)) / (pesoAv1 + pesoAv2);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}