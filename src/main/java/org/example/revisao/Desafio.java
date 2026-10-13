package org.example.revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Filme[] filmes = new Filme[5];
        int total = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MEU CATÁLOGO ===\n1 - Cadastrar filme\n2 - Listar filmes\n3 - Buscar por título" +
                    "\n4 - Estatísticas\n5 - Sair\nEscolha: ");
            int opcao;

            try {

                opcao = ler.nextInt();
                ler.nextLine();

            }catch (InputMismatchException ime) {
                System.out.println("Por favor, insira um número dentro das opções válidas.");
                ler.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    if (total < filmes.length) {
                        filmes[total] = new Filme();
                        System.out.println("Informe o titulo: ");
                        filmes[total].titulo = ler.nextLine().trim();

                        System.out.println("Informe o genero: ");
                        filmes[total].genero = ler.nextLine().trim().toUpperCase();

                        boolean notaValida = false;

                        while (!notaValida) {
                            System.out.println("Informe a nota (de 0 a 10): ");

                            try {
                                double notaDigitada = ler.nextDouble();
                                ler.nextLine();

                                if (notaDigitada >= 0 && notaDigitada <= 10) {
                                    filmes[total].nota =  notaDigitada;
                                    notaValida = true;
                                } else {
                                    System.out.println("Insira um número de 0 a 10!");
                                }
                            } catch (InputMismatchException ime) {
                                System.out.println("Digite apenas números!");
                                ler.nextLine();

                            }
                        }

                        filmes[total].classificacao = Filme.fazerClassificacao(filmes[total].nota);

                        total++;

                        System.out.println("Filme cadastrado com sucesso!");
                    } else {
                        System.out.println("Catálogo cheio!");
                    }
                    break;


                case 2:
                    if (total == 0){
                        System.out.println("Nenhum filme cadastrado!");
                        break;
                    }

                    for(int i = 0; i < total; i++){
                        System.out.printf("%s [%s] - Nota %.1f - %s%n", filmes[i].titulo, filmes[i].genero,
                                filmes[i].nota, filmes[i].classificacao);
                    }
                    break;

                case 3:
                    System.out.println("Informe o titulo: ");
                    String busca = ler.nextLine();

                    boolean encontrou = false;

                    for(int i = 0; i < total; i++){
                        if(filmes[i].titulo.equalsIgnoreCase(busca.trim())){

                            System.out.printf("%s [%s] - Nota %.1f - %s%n", filmes[i].titulo, filmes[i].genero,
                                    filmes[i].nota, filmes[i].classificacao);

                            encontrou = true;
                            break;
                        }
                    }
                    if(!encontrou){
                        System.out.println("Filme não encontrado!");
                    }
                    break;

                case 4:
                    if (total == 0){
                        System.out.println("Nenhum filme cadastrado!");
                        break;
                    }
                    double somaNotas = 0;
                    int quantidadeOtimos = 0;
                    int posicaoMelhor = 0;

                    for(int i = 0; i < total; i++) {
                        somaNotas += filmes[i].nota;

                        if (filmes[i].classificacao.equals("Ótimo")) {
                            quantidadeOtimos++;
                        }

                        if (filmes[i].nota > filmes[posicaoMelhor].nota) {
                            posicaoMelhor = i;
                        }
                    }

                        double media = somaNotas / total;

                        System.out.println("Total de filmes cadastrados: " + total);
                        System.out.printf("Media das notas: %.2f%n", media);
                        System.out.println("Melhor filme: " + filmes[posicaoMelhor].titulo);
                        System.out.println("Filmes Ótimos: " + quantidadeOtimos + " de " + total);
                    break;

                case 5:
                    System.out.println("Encerrando catálogo. Até mais!");
                    continuar = false;
                    break;

                default:
                        System.out.println("Opção inválida!");
                        break;


            }
        }
    }
}
