package com.mycompany.universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade referenciaProva) {
        super(referenciaProva);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Pode fazer AV3 mesmo já aprovado
        return true; 
    }
}
