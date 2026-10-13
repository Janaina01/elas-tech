package org.example.aula14;

public class Pix implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pix de R$ %.2f realizado!%n", valor);
    }
}
