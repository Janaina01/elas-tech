package org.example.aula6;

import java.util.Scanner;

public class Scannear {
    static void main() {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Agora, digite sua idade: ");
        int idade = sc.nextInt();

        int novaIdade = idade + 1;

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + novaIdade
                + " no próximo aniversário. ");*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        double num2 = sc.nextInt();

        double soma = num + num2;
        double subtracao = num - num2;
        double multiplicacao = num * num2;
        double divisao = num / num2;
        double resto = num % num2;

        System.out.printf("Resultados: \nSoma: %.2f\nSubtração: %.2f\nMultiplicação: %.2f\nDivisão: %.2f\nResto: %.2f\n"
                , soma,  subtracao, multiplicacao, divisao, resto);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        if(nota >= 7){
            System.out.println("Foi aprovada!");
        } else if(nota <= 6.9 && nota >= 5){
            System.out.println("Ficou de recuperação");
        }else{
            System.out.println("Foi reprovada");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do número " + numero+ ":");

        for(int i = 1; i <= 10; i++ ) {
            int tabuada = i * numero;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }
}
