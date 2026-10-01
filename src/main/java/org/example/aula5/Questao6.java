package org.example.aula5;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt();

        input.nextLine(); //consumir Enter faltante

        System.out.println("Agora, digite o seu nome completo: ");
        String nomeCompleto = input.nextLine();

        System.out.println("O usuário " +  nomeCompleto + " nasceu em " + anoNascimento + ".");
    }
}
