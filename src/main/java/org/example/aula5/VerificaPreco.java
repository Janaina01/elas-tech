package org.example.aula5;

import java.util.Scanner;

public class VerificaPreco {
    static void main() {

        for (int i = 1; i <=3; i++){
            Scanner sc = new Scanner(System.in);
            Produto produto = new Produto();

            System.out.println("Digite o nome do produto: ");
            produto.nome = sc.nextLine();

            System.out.println("Digite o valor do produto: ");
            produto.preco = sc.nextDouble();
            sc.nextLine();

            if (produto.preco > 100) {
                System.out.println("Produto Caro!");
            } else {
                System.out.println("Produto com preço acessível!");
            }
            System.out.printf("Valor: R$ %.2f%n ", produto.preco);
        }

    }
}
