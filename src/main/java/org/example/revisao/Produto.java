package org.example.revisao;

public class Produto {
    String nome;
    double preco;
    int quantidade;


    double total(){
        return preco * quantidade;
    }
}
