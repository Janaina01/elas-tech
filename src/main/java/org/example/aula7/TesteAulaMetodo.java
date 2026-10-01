package org.example.aula7;

public class TesteAulaMetodo {

    static void saudacao() {
        System.out.println("Olá!");
    }
    static int soma(int n1, int n2, int n3) {
        int resultado = n1 + n2 + n3;

        return resultado;
    }
    static int soma(double n1, int n2, int n3) {
        return 0;
    }

}
