package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    public static void main(String[] args) {
        // Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> lista = new ArrayList<String>();
        lista.addAll(List.of("Janaina", "Ana", "Maria"));
        System.out.println(lista);

        // Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        ArrayList<String> frutas = new ArrayList<String>(List.of("Banana", "Maçã", "Morango"));
        System.out.println("Primeira fruta:" + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(2));
        System.out.println("Quantas frutas tem: " + frutas.size());

        //Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        ArrayList<String> nomes = new ArrayList<>(List.of("Janaina", "Ana", "Maria", "Clara"));
        System.out.println("Nomes:" + nomes);
        nomes.set(2, "Fabiana");
        System.out.println("Nomes depois da troca:" + nomes);

        //Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        ArrayList<String> cidades = new ArrayList<>(List.of("São Paulo", "Curitiba", "Piracicaba", "Campinas"));
        System.out.println("Cidades:" + cidades);
        cidades.remove(1);
        System.out.println("Cidades depois da remoção da posição 1: " +  cidades);

        //Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
        // (Dica: i + ": " + comando para pegar posição da lista)
        ArrayList<String> lista2 = new ArrayList<>(List.of("Janaina", "Ana", "Maria", "Fernanda", "Joana", "Amanda"));

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println("Nome " + i + ":" + lista2.get(i));
        }

        //Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
        // Se não estiver, avise.
        ArrayList<String> lista3 = new ArrayList<>(List.of("Janaina", "Ana", "Maria", "Fernanda", "Joana"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = scanner.next();

        if (lista3.contains(nome)) {
            System.out.println("Este nome está na lista, na posição " + lista3.indexOf(nome) + ".");
        }else{
            System.out.println("Este nome não está na lista.");
        }


    }
}
