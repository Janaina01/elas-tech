package org.example.revisaopoo;

public abstract class Forma {
    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }
    public void exibirNome(){
        System.out.println("Forma: " + nome);
    }
    public abstract double calcularArea();
}
