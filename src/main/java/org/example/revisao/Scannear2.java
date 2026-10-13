package org.example.revisao;

import java.util.Scanner;

public class Scannear2 {
    static void main() {
        //Pergunte o nome da pessoa e responda: "Olá, [nome]!"

        System.out.println("\n--- QUESTÃO 1 ---\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Olá, " +  nome + "!");

        //Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("No próximo aniversário, você irá fazer " + (idade + 1) + " anos de idade!");

        //Pergunte dois números e mostre a soma.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        System.out.println("Digite dois números: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println("Soma dos números: " + (n1 + n2));

        //Pergunte a altura e o peso e imprima os dois numa frase.

        System.out.println("\n--- QUESTÃO 4 ---\n");
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Agora, digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.printf("Sua altura é %.2f m² e você pesa %.2f Kg.", altura, peso);

        /*🔥 Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        Depois imprima tudo numa ficha.

        💡 Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome.
        Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás.
        O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.*/

        System.out.println("\n--- DESAFIO! ---\n");

        System.out.println("Digite sua idade: ");
        int idade2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu nome:");
        String nome2 = scan.next();
        scan.nextLine();

        System.out.println("Digite a cidade onde mora: ");
        String cidade = scan.next();
        scan.nextLine();

        System.out.println("Seu nome é " + nome2 + ", você tem " + idade2 + " anos de idade e mora em " + cidade + "!");
    }
}
