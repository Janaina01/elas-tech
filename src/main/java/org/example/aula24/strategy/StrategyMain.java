package org.example.aula24.strategy;

public class StrategyMain {
        public static void main(String[] args) {

            Compra compra = new Compra(new DescontoEstudante());

            System.out.println(compra.calcularPrecoFinal(100));
            // 90.0





            compra = new Compra(new DescontoVIP());

            System.out.println(compra.calcularPrecoFinal(100));
            // 80.0
        }
}
