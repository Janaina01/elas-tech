package org.example.revisao;

public class RevisaoMetodos {

    public static void mostrarBoasVindas() {
        System.out.println("Bem vindo!");
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " +  nome + "!");
    }

    public static int dobro(int numero){
        return numero * 2;
    }

    public static double calcularMedia(double n1, double n2){
        double media = (n1 * n2)/2;
        return media;
    }

    public static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int somar(int a, int b, int c){
        return a + b + c;
    }

    public static boolean ehMaiorDeIdade(int idade){
        return idade >= 18;
    }
    public static void liberarEntrada(int idade){
        if(ehMaiorDeIdade(idade)){
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Não pode entrar!");
        }

    }

}
