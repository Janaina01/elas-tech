package org.example.revisao;

import java.util.Scanner;

public class Strings {
    static void main() {
        //Peça o nome completo e mostre quantas letras ele tem.

        System.out.println("\n--- QUESTÃO 1 ---\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome completo:");
        String nome = input.nextLine();

        System.out.println("Seu nome tem " + nome.length() + " letras.");

        //Peça o nome e mostre em MAIÚSCULO e em minúsculo.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        System.out.println("Seu nome em maiúsculo: " +  nome.toUpperCase() + "\nSeu nome em minúsculo: "
                +  nome.toLowerCase());

        //Peça o nome e mostre a primeira letra.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        System.out.println("A primeira letra do seu nome: " + nome.charAt(0));

        //Peça uma frase e uma palavra. Diga se a palavra aparece na frase.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        System.out.println("Diga uma frase: ");
        String frase = input.nextLine();

        System.out.println("Informe uma palavra que você queira validar se estava na frase: ");
        String palavra = input.nextLine();

        System.out.println("A palavra " + palavra + " está na frase " + frase + "? " + frase.contains(palavra));

        //Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        System.out.println("Fale um nome: ");
        String nome2 = input.nextLine();

        System.out.println("Agora, fale outro: ");
        String nome3 = input.nextLine();

        System.out.println("Eles são iguais? " + nome2.equalsIgnoreCase(nome3));

        //Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).

        System.out.println("\n--- QUESTÃO 6 ---\n");

        System.out.println("Informe um nome completo: ");
        String nome4 = input.nextLine();

        System.out.println("Seu nome em maiúsculo e sem espaços: " + nome4.toUpperCase().trim());

        /*🔥 Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra,
        ignorando maiúscula e minúscula.
                Exemplos: ana → sim · Ovo → sim · casa → não

        💡 A primeira letra está na posição 0. A última está na posição length() - 1,
        porque a contagem começa no zero. E pra ignorar maiúscula, converta a palavra inteira antes de comparar.*/

        System.out.println("\n--- DESAFIO! ---\n");

        System.out.println("Informe uma palavra: ");
        String palavra2 = input.nextLine();

        palavra2 = palavra2.toUpperCase();

        if (palavra2.charAt(0) == palavra2.charAt(palavra2.length() - 1)) {
            System.out.println(palavra2 + " começa e termina com a mesma letra? SIM!");
        } else {
            System.out.println(palavra2 + " começa e termina com a mesma letra? NÃO!");
        }
    }
}
