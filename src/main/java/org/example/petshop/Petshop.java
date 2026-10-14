package org.example.petshop;

import java.util.Scanner;

public class Petshop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Pet[] listaPets = new Pet[5];

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {
            System.out.println("=== PETSHOP ===\n1 - Cadastrar pet\n2 - Listar pets\n3 - Buscar pet pelo nome\n" +
                    "0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (total >= listaPets.length) {
                        System.out.println("Cadastro cheio!");
                        break;
                    }
                    Pet meuPet = new Pet();
                    System.out.println("Informe o nome do pet:");
                    meuPet.nome = sc.next();
                    System.out.println("Informe a espécie:");
                    meuPet.especie = sc.next();
                    System.out.println("Informe o peso do pet (kg): ");
                    meuPet.peso = sc.nextDouble();
                    sc.nextLine();

                    meuPet.porte = meuPet.definirPorte();

                    listaPets[total] = meuPet;
                    total++;
                    System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                    break;
                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum pet cadastrado.");
                    } else {
                        System.out.println("--- PETS CADASTRADOS ---");

                        for (int i = 0; i < total; i++) {
                            System.out.printf("%s (%s) - %.1f kg - Porte %s%n",
                                    listaPets[i].nome,
                                    listaPets[i].especie,
                                    listaPets[i].peso,
                                    listaPets[i].porte);
                        }

                    }
                    break;
                case 3:
                    System.out.println("Qual pet você procura?");
                    String busca = sc.nextLine();

                    boolean achou = false;

                    for (int i = 0; i < total; i++) {
                        if (listaPets[i].nome.equalsIgnoreCase(busca)) {
                            System.out.printf("Encontrado: %s (%s) - %.1f kg - Porte %s%n",
                                    listaPets[i].nome,
                                    listaPets[i].especie,
                                    listaPets[i].peso,
                                    listaPets[i].porte);
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Pet não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Ok, até mais tarde!");
                    break;
                default:
                System.out.println("Opção inválida");
            }
        }


    }
}
