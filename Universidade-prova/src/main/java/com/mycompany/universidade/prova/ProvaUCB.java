package com.mycompany.universidade.prova;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB() {
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;
        this.mediaMinima = 7;
    }

    @Override
    public double calcularMedia() {
        if (realizouProvaFinal) {
            // Substitui a menor nota entre AV1 e AV2 pela AV3
            double menorNota = Math.min(av1, av2);
            if (av1 == menorNota) {
                return (av3 + av2) / 2.0;
            } else {
                return (av1 + av3) / 2.0;
            }
        }
        return (av1 + av2) / 2.0;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}
