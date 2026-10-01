package org.example.aula2;

public class Concatenacao {
    static void main() {

        //1 - Concatenar apresentação
        String nome = "Ana";
        String cidade = "Salvador";
        int idade = 28;
        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");

        //2 - Concatenar a compra de um produto e seu resultado
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;
        double total = 50.00;
        System.out.println("Comprei " + quantidade + " unidades de " +  produto + " por R$ " +  preco
                + " cada. Total: R$ " + (quantidade * preco) + ".");

        //3 - Concatenar soma de valores
        int valor1 = 15;
        int valor2 = 4;
        int resultado = valor1 + valor2;
        System.out.println("A soma de " + valor1 + " e " + valor2 + " é igual a " + resultado + ".");
    }
}
