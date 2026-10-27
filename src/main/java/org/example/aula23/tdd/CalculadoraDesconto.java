package org.example.aula23.tdd;

public class CalculadoraDesconto {
    public double aplicarDesconto(double valorCompra, boolean clienteVip) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException(
                    "O valor da compra deve ser maior que zero."
            );
        }
        if (valorCompra < 100 && !clienteVip) {
            return valorCompra;
        }
        if (clienteVip) {
            return valorCompra * 0.90;
        }
        return valorCompra;
    }

}
