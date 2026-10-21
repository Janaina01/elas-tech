package org.example.aula19.interfaces;

public class Oracle implements BancoDeDados {
    public void chamarBanco() {
        System.out.println("O banco conectado é o Oracle.");
    }
    public int getNumero() {
        return 0;
    }
    public void proibidoBarulhoDepoisDasDez() {

    }
}
