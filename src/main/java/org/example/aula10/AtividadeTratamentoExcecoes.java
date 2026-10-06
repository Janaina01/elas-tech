package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeTratamentoExcecoes {
    public static void main(String[] args) {
        /*1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
        Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que
        não dá pra dividir por zero.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("\n---- QUESTÃO 1 ----\n");
        System.out.println("Informe dois números inteiros:");

        int numero1 =  sc.nextInt();
        int numero2 =  sc.nextInt();

        try {
            int divisao = numero1 / numero2;
            System.out.println("Resultado: " + divisao);

        } catch (ArithmeticException ae) {
            System.out.println("Não dá pra dividir por zero!");

        } finally {
            System.out.println("Operação finalizada.");
        }

        /*2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
        Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.*/

        System.out.println("\n---- QUESTÃO 2 ----\n");

        int[] notas = {10, 5, 8, 9, 10};
        System.out.println("informe uma posição: ");

        try {

            int posicao = sc.nextInt();
            System.out.println(notas[posicao]);
        }catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Posição inexistente. Informe um valor de 0 a 4.");
        }

        System.out.println("\n---- QUESTÃO 3 ----\n");

        try {
            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();
        } catch(InputMismatchException ime){
            System.out.println("Por favor, informe um número.");
        }

        /* 4 - Crie uma variável String nome = null; e tente imprimir nome.length().
        Trate a NullPointerException e mostre "O nome não foi preenchido." */

        System.out.println("\n---- QUESTÃO 4 ----\n");

        try {
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido.");
        }

        /*5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        Trate a ArithmeticException para o caso de ela digitar 0.*/

        System.out.println("\n---- QUESTÃO 5 ----\n");

        try {
            sc.nextLine();
            System.out.println("Escreva um número:");
            int numero = sc.nextInt();

            double resto = 100 % numero;
            System.out.println("Resto da divisão de 100 por " + numero + " : " +  resto);
        } catch (ArithmeticException ae) {
            System.out.println("Não é possível dividir por zero!");
        }

        /*6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a
        ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch,
        imprima "O programa continua funcionando."*/
        System.out.println("\n---- QUESTÃO 6 ----\n");

        try {
            String[] nomes = {"Joana", "Maria", "Talita"};
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Essa posição não existe.");
        }
        System.out.println("O programa continua funcionando. :)");




    }
}
