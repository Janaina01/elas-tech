package org.example.revisao;

import java.util.Scanner;

public class Condicionais {
    static void main() {
        //Peça a idade e diga se a pessoa é maior ou menor de idade.

        System.out.println("\n--- QUESTÃO 1 ---\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if(idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        //Peça um número e diga se ele é par ou ímpar.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0) {
            System.out.println("Este número é par. ");
        } else{
            System.out.println("Este número é ímpar.");
        }

        //Peça dois números e diga qual é o maior. Se forem iguais, avise.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        System.out.println("Informe dois números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " +  num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " é maior que " +  num1);
        }else {
            System.out.println("Os números são iguais.");
        }

        //Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".

        System.out.println("\n--- QUESTÃO 4 ---\n");

        System.out.println("Informe uma nota: ");
        double nota = scan.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovada!");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovada!");
        }

        //Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        System.out.println("Informe um número de 1 a 3: ");
        String opcao = scan.next();

        switch (opcao) {
            case "1":
                System.out.println("Sorvete de chocolate.");
                case "2":
                    System.out.println("Sorvete de coco.");
                    case "3":
                        System.out.println("Sorvete de morango.");
                        break;
        }

        //Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.

        System.out.println("\n--- QUESTÃO 6 ---\n");

        System.out.println("Informe sua idade: ");
        int idade2 = scan.nextInt();

        if (idade2 <= 12 || idade2 >= 60) {
            System.out.println("O valor do ingresso é de R$ 10,00.");
        } else {
            System.out.println("O valor do ingresso é de R$ 25,00.");
        }

        /*🔥 Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero;
        dois iguais → Isósceles; todos diferentes → Escaleno.

        💡 A ordem dos testes importa. Repare que um triângulo equilátero também tem dois lados iguais — então,
        se o teste do isósceles vier primeiro, nenhum equilátero vai ser encontrado.*/

        System.out.println("\n--- DESAFIO! ---\n");

        System.out.println("Informe as 3 medidas dos lados do triângulo:");
        int medida1 = scan.nextInt();
        int medida2 = scan.nextInt();
        int medida3 = scan.nextInt();

        if (medida1 == medida2 && medida1 == medida3 && medida2 == medida3) {
            System.out.println("Essas medidas são de um triângulo Equilátero!");
        } else if (medida1 == medida2 || medida1 == medida3 || medida2 == medida3) {
            System.out.println("Essas medidas são de um triângulo Isósceles!");
        } else {
            System.out.println("Essas medidas são de um triângulo Escaleno!");
        }



    }
}
