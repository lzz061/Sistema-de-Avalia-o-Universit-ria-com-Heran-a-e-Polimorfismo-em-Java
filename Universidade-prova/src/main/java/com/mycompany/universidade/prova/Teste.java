package com.mycompany.universidade.prova;

public class Teste {
    public static void main(String[] args) {
        System.out.println("====== TESTE: UCB ======");
        ProvaUCB ucb = new ProvaUCB();
        ucb.setAv1(5.0); // Nota AV1
        ucb.setAv2(6.0); // Nota AV2
        
        System.out.println("Média Parcial: " + ucb.calcularMedia());
        System.out.println("Situação Parcial: " + (ucb.aprovado() ? "Aprovado" : "Reprovado"));

        ProvaFinalUniversidade finalUcb = ucb.getProvaFinalUniversidade();
        if (finalUcb.habilitadoRealizarProva()) {
            System.out.println("-> Realizando AV3 na UCB...");
            ucb.setAv3(8.0); // AV3 substitui a menor nota (5.0)
            System.out.println("Média Final (com AV3): " + ucb.calcularMedia());
            System.out.println("Situação Final: " + (ucb.aprovado() ? "Aprovado" : "Reprovado"));
        }

        System.out.println("\n====== TESTE: FAFIFO ======");
        ProvaFafifo fafifo = new ProvaFafifo();
        fafifo.setAv1(4.0); // Nota AV1
        fafifo.setAv2(5.0); // Nota AV2
        
        System.out.println("Média Parcial: " + fafifo.calcularMedia());
        System.out.println("Situação Parcial: " + (fafifo.aprovado() ? "Aprovado" : "Reprovado"));

        ProvaFinalUniversidade finalFafifo = fafifo.getProvaFinalUniversidade();
        if (finalFafifo.habilitadoRealizarProva()) {
            System.out.println("-> Aluno habilitado para AV3 na Fafifo (não atingiu a média 6).");
            fafifo.setAv3(7.0); // AV3 = 7.0 (peso 3) -> (4*1 + 5*1 + 7*3) / 5 = 6.0
            System.out.println("Média Final (com AV3): " + fafifo.calcularMedia());
            System.out.println("Situação Final: " + (fafifo.aprovado() ? "Aprovado" : "Reprovado"));
        } else {
            System.out.println("-> Aluno não precisa fazer AV3 na Fafifo.");
        }
    }
}
