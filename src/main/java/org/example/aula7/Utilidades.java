package org.example.aula7;

import java.util.Scanner;
public class Utilidades {
    public static void mostrarBoasVindas() {

        System.out.println("Bem-vinda ao curso de Java!");
    }
        public static void saudar() {
            for (int i = 1; i <= 3; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um nome:");
                String nome = sc.nextLine();
                System.out.println("Olá, " + nome + "! Tudo bem?");
            }
        }

        public static int dobro(int numero) {
            int duplica = numero * 2;

            return duplica;
        }

        public static double calcularMedia(double n1, double n2) {
            double media = (n1 + n2) / 2;
            return media;
        }

        public static boolean ehMaiorDeIdade(int idade) {
            return idade >= 18;
        }

        public static int somar(int valor1, int valor2) {
            int soma = valor1 + valor2;
            return soma;
        }

        public static int somar(int valor1, int valor2, int valor3) {
            int soma = valor1 + valor2 + valor3;
            return soma;
        }

        public static double somar(double valor1, double valor2) {
            double soma = valor1 + valor2;
            return soma;
        }

       public static void saudacao (){
           System.out.println("Olá");
       }

       public static void saudacao (String nome) {
           System.out.println("Olá, " + nome + "!");
       }


    }