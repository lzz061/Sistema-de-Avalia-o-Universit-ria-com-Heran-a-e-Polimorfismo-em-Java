package com.mycompany.universidade.prova;

public abstract class ProvaFinalUniversidade {
    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade referenciaProva;

    public ProvaFinalUniversidade(ProvaUniversidade referenciaProva) {
        this.referenciaProva = referenciaProva;
    }

    // Método Abstrato
    public abstract boolean habilitadoRealizarProva();
}
