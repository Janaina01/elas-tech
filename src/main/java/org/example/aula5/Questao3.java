package org.example.aula5;

import java.util.Scanner;

public class Questao3 {
    static void main() {

        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nEscolha qual produto gostaria: \n1) Ver camisas \n2) Ver calças \n3) Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Ver camisas");
                    break;
                case 2:
                    System.out.println("Ver calças");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
            while (opcao != 3);
    }
}
