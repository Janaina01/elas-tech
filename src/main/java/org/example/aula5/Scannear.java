package org.example.aula5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scannear {
    static void main() {
        /*Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: ");*/

        /*for (int i = 10; i >= -1; i--){
            System.out.println("Volta " + i);*/

        Scanner scanner=new Scanner(System.in);

        int senha = 0;

        /*while (senha != 1234){
            System.out.println("Digite sua senha: ");
            senha=scanner.nextInt();
        }
        System.out.println("Acesso liberado!");*/

        do{
            System.out.println("Digite sua senha: ");
            senha=scanner.nextInt();
        }while(senha !=1234);
            System.out.println("Acesso liberado!");


        /*int senha = 1;
        int numero = 0;

        while (numero < 5){
            numero++;
            System.out.println(numero);
        }*/

    }
}
