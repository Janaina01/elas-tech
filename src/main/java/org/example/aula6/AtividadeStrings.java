package org.example.aula6;

import java.util.Scanner;

public class AtividadeStrings {
    static void main() {
        /* Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome completo:");
        String nomeCompleto = input.nextLine();

        System.out.println("1- Quantidade de letras: " + nomeCompleto.length());
        System.out.println("2 - Nome em MAIÚSCULO: " + nomeCompleto.toUpperCase());
        System.out.println("3- Nome em minúsculo: " + nomeCompleto.toLowerCase());
        System.out.println("4- Primeira letra do nome: " + nomeCompleto.charAt(0));*/

        //Questão 4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase?\n" + frase.contains(palavra));*/

        //Questão 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite de novo: ");
        String novoNome = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase(novoNome));


    }
}
