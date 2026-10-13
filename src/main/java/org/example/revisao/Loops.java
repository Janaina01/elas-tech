package org.example.revisao;

import java.util.Scanner;

public class Loops {
    static void main() {
        //Imprima os números de 1 a 20, um por linha.

        System.out.println("\n--- QUESTÃO 1 ---\n");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        //Imprima a contagem regressiva de 10 até 1 e depois "Fim!".

        System.out.println("\n--- QUESTÃO 2 ---\n");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");

        //Peça um número e mostre a tabuada dele de 1 a 10.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        //Imprima só os números pares de 1 a 30.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Usando for, some todos os números de 1 a 100 e mostre o resultado.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + soma);

        //Refaça o primeiro exercício com while. Compare os dois códigos.

        System.out.println("\n--- QUESTÃO 6 ---\n");

        int contador = 1;

        while(contador <= 20) {
            System.out.println(contador);
            contador++;
        }

        //Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.

        System.out.println("\n--- QUESTÃO 7 ---\n");

        int energia = 3;

        do {
            System.out.println("Jogando...");
            energia--;
        }while(energia > 0);

        /*🔥 Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:
           Digite a altura: 5 * ** *** **** *****
        💡 Você vai precisar de um laço dentro do outro. O de fora controla a linha;
        o de dentro imprime os asteriscos daquela linha. Repare que a quantidade de asteriscos muda conforme a linha.*/

        System.out.println("\n--- DESAFIO! ---\n");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite a altura do triângulo: ");
        int numero1 = sc1.nextInt();

        for (int i = 1; i <= numero1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
