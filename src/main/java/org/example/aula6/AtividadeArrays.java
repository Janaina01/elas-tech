package org.example.aula6;

import java.util.Scanner;

public class AtividadeArrays {
    public static void main(String[] args) {

        //Questão 1
        String[] nomes = {"Ana", "Maria", "Joana", "Paula", "Sofia"};
        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);


        //Questão 2 e 3
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma = soma + notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        //Questão 4
        Scanner sc = new Scanner(System.in);
        int[] numero = new int [5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero: ");
            numero[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(numero[i]);

        }
    }
}
