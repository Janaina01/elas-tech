package org.example.revisao;

public class VariaveisTipos {
    static void main() {
        //Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
        System.out.println("--- QUESTÃO 1 ---\n");

        String nome = "Janaina";
        int idade = 28;
        double altura = 1.7;
        boolean jaPrograma = true;

        System.out.println("NOme: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Já programou antes: " + jaPrograma);

        //Crie uma variável cidade e imprima: "Eu moro em Salvador."

        System.out.println("\n--- QUESTÃO 2 ---\n");

        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade);

        //Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        String primeiroNome = "Janaina";
        String sobrenome = "Ramos de Oliveira";

        System.out.println("Nome Completo: " + primeiroNome + " " + sobrenome);

        //Crie uma variável preco com 29.90 e imprima o valor dela numa frase.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        double preco = 29.90;
        System.out.printf("O preço do almoço foi de R$ %.2f.", preco);

        //Crie uma variável temCarteira com true e imprima.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        boolean temCarteira = true;
        System.out.println("Tem carteira: " + temCarteira);


        /*🔥 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10,
        sem escrever os números 10 e 20 de novo.
         Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável
         pra guardar alguma coisa antes.
         */

        System.out.println("\n--- DESAFIO! ---\n");

        int a = 10;
        int b = 20;
        int temporaria = a;

        System.out.println("Valor de a: " + (a = b) + "\nValor de b: " + (b = temporaria));



    }
}
