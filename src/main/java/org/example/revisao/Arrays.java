package org.example.revisao;

import java.util.Scanner;

public class Arrays {
    static void main() {
        //Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.

        System.out.println("\n--- QUESTÃO 1 ---\n");

        String[] nomes = {"Ana", "Maria", "Joana", "Paula", "Sofia"};
        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);

        //Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        //Com o mesmo array, calcule e imprima a soma e a média.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Soma: " + soma + "\nMédia: " + media);

        //Crie um array com 5 números e descubra qual é o maior.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        int[] numeros = {8, 6, 10, 7, 9};
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior número: " + maior);

        //Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        int[] notas2 = {8, 5, 10, 4, 7};
        int soma2 = 0;

        for (int i = 0; i < notas2.length; i++) {
            if (notas2[i] >= 7) {
                soma2 += notas2[i];
            }
        }
        System.out.println("Soma: " + soma2);


        /*🔥 Mini-desafio — Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está.
        Se não estiver na lista, avise.
        💡 Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei".
        Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.*/

        System.out.println("\n--- DESAFIO! ---\n");

        String[] nomes2 = {"Mariana", "Claudete", "Janaina", "Paula", "Sofia"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        int posicao = -1;

        for (int i = 0; i < nomes2.length; i++) {

            if (nomes2[i].equals(nome)) {
                posicao = i;
            }
        }
            if (posicao == -1) {
                System.out.println("Nome não encontrado");
            } else {System.out.println("Este nome existe e está na posição " + posicao);
        }


    }
}
