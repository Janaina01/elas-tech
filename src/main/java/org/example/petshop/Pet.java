package org.example.petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    public String definirPorte(){
        if (peso < 10) {
        return porte = "Pequeno";
    } else if (peso < 25) {
        return porte = "Médio";
    } else {
        return porte = "Grande";
        }
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som genérico.");
    }
}
