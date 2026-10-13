package org.example.revisao;

public class Operadores {
    static void main() {
        //Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.

        System.out.println("--- QUESTÃO 1 ---\n");

        int a = 15;
        int b = 4;

        System.out.println("Soma: " + (a + b) + "\nSubtração: " + (a - b) + "\nMultiplicação: " + (a * b)
                + "\nDivisão: " + (a / b) + "\nResto: " + (a % b));


        //Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        int saldo = 1000;

        saldo += 250;
        saldo -= 380;

        System.out.println("Saldo final: " + saldo);

        //Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        int a1 = 10;
        int b1 = 10;

        System.out.println("Resultado de a == b : " + (a == b) + "\nResultado de a != b : " + (a != b)
        + "\nResultado de a > b : " + (a > b) + "\nResultado de a >= b : " +  (a >= b));

        //Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        int idade = 20;
        boolean temCarteira = true;

        System.out.println("Idade maior ou igual a 18: " + (idade >= 18) + "\nTem carteira? " + temCarteira);

        //Crie um número e imprima o resto da divisão dele por 2.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        int numero = 105;

        System.out.println("Resto da divisão de " + numero + " por 2: " + (numero % 2));

        //Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

        System.out.println("\n--- QUESTÃO 6 ---\n");

        int quantPacote = 3;
        double valorArroz = 5.50;

        System.out.printf("Valor total da compra: R$ %.2f.", (quantPacote * valorArroz));

        /*🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if,
        imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
         💡 Uma comparação já produz true ou false sozinha — não precisa de if pra isso.
         E um número é divisível por outro quando o resto da divisão é zero.*/

        System.out.println("\n--- DESAFIO! ---\n");

        int numero1 = 10;

        System.out.println("O número " + numero1 + " é divisível por 3 e por 5 ao mesmo tempo? "
                + (numero1 % 3 == 0 && numero1 % 5 == 0));

    }
}
