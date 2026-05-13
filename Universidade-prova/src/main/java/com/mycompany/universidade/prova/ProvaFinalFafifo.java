package com.mycompany.universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade referenciaProva) {
        super(referenciaProva);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Só faz AV3 se ainda não atingiu a média na AV1 e AV2
        double mediaParcial = (referenciaProva.av1 + referenciaProva.av2) / 2.0; 
        return mediaParcial < referenciaProva.mediaMinima;
    }
}
