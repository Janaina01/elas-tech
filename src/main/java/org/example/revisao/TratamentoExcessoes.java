package org.example.revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcessoes {
    static void main() {

        //Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.
        Scanner sc = new Scanner(System.in);
        /*System.out.println("\n---- QUESTÃO 1 ----\n");

        System.out.println("Informe dois números:");

        int numero1 =  sc.nextInt();
        int numero2 =  sc.nextInt();

        try {
            int divisao = numero1 / numero2;
            System.out.println("Resultado da divisão: " + divisao);

        } catch (ArithmeticException ae) {
            System.out.println("Não dá pra dividir por zero!");

        } finally {
            System.out.println("Operação finalizada.");
        }

        //Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.

        System.out.println("\n---- QUESTÃO 2 ----\n");

        int[] notas = {5, 7, 9, 10, 10};

        try {
            System.out.println("Informe uma posição: ");
            int posicao = sc.nextInt();

            System.out.println("Nota: " +  notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Informe uma posição de 0 a 4");
        }


        //Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.

        System.out.println("\n---- QUESTÃO 3 ----\n");

        try {
            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Por favor, informe sua idade em número, não utilize letras.");
        }*/

        //Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.

        System.out.println("\n---- QUESTÃO 4 ----\n");

        String nome = null;

        try {
            System.out.println("Quantidade de letras: " + nome.length());
        } catch (NullPointerException npe){
            System.out.println("Essa String está nula.");
        }


        /*Crie um array com 3 nomes e tente imprimir a posição 5. Trate a exceção e, depois do try/catch,
        imprima "O programa continua funcionando."
         */

        System.out.println("\n---- QUESTÃO 5 ----\n");

        try {
            String[] nomes = {"Maria", "Ana", "Joana"};
            System.out.println("Nome: " + nomes[5]);

        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Posição inexistente.");

        } finally {
            System.out.println("O programa continua funcionando.");
        }


        /*🔥 Mini-desafio — Faça um programa com um try e três catch diferentes: um para divisão por zero,
        um para posição inválida de array e um genérico (Exception) no final. Teste cada situação e
        veja qual catch é acionado.
        💡 O catch (Exception e) pega qualquer erro, então ele precisa ser o último. Se vier antes dos outros,
        o código nem compila — os de baixo nunca seriam alcançados.*/

        System.out.println("\n---- DESAFIO! ----\n");

        try {
            System.out.println("Informe dois números:");
            int n1 =  sc.nextInt();
            int n2 =  sc.nextInt();
            int divisao = n1 / n2;
            System.out.println("Resultado da divisão: " + divisao);

            int[] notas2 = {10, 9, 8, 6, 10};
            System.out.println("Informe uma posição: ");
            int posicao2 = sc.nextInt();

            System.out.println("Nota: " +  notas2[posicao2]);

        } catch (ArithmeticException ae) {
            System.out.println("Não dá pra dividir por zero!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Posição  inexistente.");
        } catch (Exception e) {
            System.out.println("O programa não reconheceu sua informação, tente novamente.");
        }
    }



}
