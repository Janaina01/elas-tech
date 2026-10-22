package org.example.aula19.interfaces;

public class MongoDb implements BancoDeDados{
    public void chamarBanco() {

    }

    int numero;
    String pessoa;

    public void proibidoBarulhoDepoisDasDez() {
        System.out.println("Barulho!!");

    }
    public int getNumero() {
        return numero;
    }
}
