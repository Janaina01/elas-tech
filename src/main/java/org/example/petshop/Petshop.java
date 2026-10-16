package org.example.petshop;

import java.util.*;

public class Petshop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Pet[] listaPets = new Pet[5];
        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {
            System.out.println("=== PETSHOP ===\n1 - Cadastrar pet\n2 - Listar pets\n3 - Buscar pet pelo nome\n" +
                    "4 - Listar espécies diferentes\n5 - Entrar na fila de banho\n6- Atender o próximo pet\n" +
                    "7 - Executar serviços\n0 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= listaPets.length) {
                            System.out.println("Cadastro cheio!");
                            break;
                        }

                        System.out.println("Informe a espécie:");
                        String especie = sc.next();

                        Pet meuPet;
                        if (especie.equalsIgnoreCase("Cachorro")) {
                            meuPet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            meuPet = new Gato();
                        } else {
                            meuPet = new Pet();
                        }

                        meuPet.especie = especie;

                        System.out.println("Informe o nome do pet:");
                        meuPet.nome = sc.next();

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
                                System.out.println("---");
                                System.out.printf("%s (%s) - %.1f kg - Porte %s%n",
                                        listaPets[i].nome,
                                        listaPets[i].especie,
                                        listaPets[i].peso,
                                        listaPets[i].porte);

                                        listaPets[i].emitirSom();

                                        mostrarFicha(listaPets[i]);

                                System.out.println("---");

                                mostrarFicha(listaPets[i], "=== FICHA DO PET ===");
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
                    case 4:
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(listaPets[i].especie);
                        }

                        System.out.println("--- ESPÉCIES CADASTRADAS ---");

                        for (String especieCadastrada : especies) {
                            System.out.println("- " +  especieCadastrada);
                        }
                        System.out.println("Total de espécies diferentes: " + especies.size());

                        break;
                    case 5:
                        System.out.println("Nome do pet pra entrar na fila: ");
                        String fila = sc.nextLine();

                        filaBanho.add(fila);

                        System.out.println(fila + " entrou na fila.");
                        System.out.println("Fila agora: " +  filaBanho);
                        break;
                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("A fila está vazia!");
                        } else {
                            System.out.println("Próximo da fila: " + filaBanho.peek());

                            String proximo = filaBanho.poll();

                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;
                    case 7:
                        System.out.println("Nome do pet:");
                        String nomeServico = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();

                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico servico : servicos) {
                            servico.executar(nomeServico);
                        }
                        break;
                    case 0:
                        System.out.println("Ok, até mais tarde!");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }catch (InputMismatchException ime){
                System.out.println("Valor inválido! Digite apenas números!");
                sc.nextLine();
            }
        }

    }
    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }
    static void mostrarFicha(Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Especie: " + pet.especie);
        System.out.printf("Peso: %.1f kg%n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }
}