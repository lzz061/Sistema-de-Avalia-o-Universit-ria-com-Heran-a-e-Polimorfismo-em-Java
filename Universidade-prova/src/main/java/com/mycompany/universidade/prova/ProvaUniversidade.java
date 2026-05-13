package com.mycompany.universidade.prova;

public abstract class ProvaUniversidade {
    protected double av1;
    protected double av2;
    protected double av3;
    protected double pesoAv1;
    protected double pesoAv2;
    protected double pesoAv3;
    protected double mediaMinima;
    protected boolean realizouProvaFinal;

    // Métodos Abstratos
    public abstract double calcularMedia();
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    // Método Concreto
    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }

    // Setters auxiliares para inserção de notas
    public void setAv1(double av1) { this.av1 = av1; }
    public void setAv2(double av2) { this.av2 = av2; }
    public void setAv3(double av3) { 
        this.av3 = av3; 
        this.realizouProvaFinal = true; 
    }
}
