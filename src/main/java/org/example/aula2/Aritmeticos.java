package org.example.aula2;

public class Aritmeticos {
    static void main() {
        /* Os resultados são diferentes porque, no primeiro caso, após encontrar uma String, o operador + realiza a
        concatenação dos valores, resultando em 22.
        No segundo caso, os parênteses fazem a soma 2 + 2 primeiro, resultando em 4, que depois é concatenado ao texto.
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
        */


        //Questão 1
        int a = 10;
        int b = 3;


        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));



        //Questão 2
        /*double a = 10;
        double b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));*/

        /*
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;
        int soma = nota1 + nota2 + nota3;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma / 3);
        */

        /*//Questão 4 e 5
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println("Resultado de a + b * c: " + (a + b * c));
        System.out.println("Resultado de (a + b) * c: " + ((a + b) * c));*/


        /*//Desafio
        int segundos = 3785;

        System.out.println("Minutos: " + segundos / 60);
        System.out.println("Segundos restantes: " + segundos % 60);*/

    }
}
