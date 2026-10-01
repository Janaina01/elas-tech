package org.example.aula5;

import java.util.Scanner;

public class Questao1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nomeLanche;
        double valorLanche;
        double total;

        System.out.println("Digite o nome do lanche: ");
        nomeLanche = sc.nextLine();
        System.out.println("Digite o valor do lanche: ");
        valorLanche = sc.nextDouble();

        if (valorLanche > 30) {
            total = valorLanche - 5;
        } else {
            total = valorLanche;
        }

        System.out.printf("O lanche " + nomeLanche + " custa R$ %.2f\n", total);

    }
}


