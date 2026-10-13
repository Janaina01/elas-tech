package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class AtividadeHashSet {
    static void main() {
        /*1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        com o repetido.*/

        System.out.println("\n---QUESTÃO 1---\n");

        HashSet<String> nomes = new HashSet<>();

        nomes.addAll(List.of("Joana", "Maria", "Fernanda", "Fernanda"));

        System.out.println(nomes);
        System.out.println(nomes.size());

        System.out.println("Análise: O valor repetido não apareceu e não foi considerado na lista. " +
                "O HashSet não permite valores duplicados!");


        /*2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        de um if para avisar se a cor "verde" já está no conjunto ou não.*/

        System.out.println("\n---QUESTÃO 2---\n");

        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Azul", "Verde", "Amarelo", "Laranja", "Rosa"));
        System.out.println("A cor verde já está no conjunto?");

        if (cores.contains("Verde")){
            System.out.println("Essa cor já está no conjunto.");
        } else {
            System.out.println("Essa cor não está no conjunto.");
        }

        /*3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
        tirar os repetidos. Imprima os dois e compare.*/

        System.out.println("\n---QUESTÃO 3---\n");

        ArrayList <String> listaNomes = new ArrayList<>();
        listaNomes.addAll(List.of("Joana", "Maria", "Fernanda", "Fernanda", "Maria", "Ana", "Joana"));

        HashSet<String> novaListaNomes = new HashSet<>();
        novaListaNomes.addAll(listaNomes);

        System.out.println("Com ArrayList: " + listaNomes);
        System.out.println("Com HashSet: " + novaListaNomes);

        /*4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        imprima de novo, junto com o tamanho.*/

        System.out.println("\n---QUESTÃO 4---\n");

        HashSet<String> cpf = new HashSet<>();
        cpf.addAll(List.of("698.370.090-20", "606.567.420-62", "888.260.910-30" ));
        System.out.println("Lista CPFs: " + cpf + "\nTamanho: " +  cpf.size());

        cpf.remove("606.567.420-62");

        System.out.println("Lista de CPFs após remoção: " + cpf + "\nTamanho: " +  cpf.size());

        /*5. Crie um HashSet com três frutas e percorra ele com for,
        imprimindo uma por linha.*/

        System.out.println("\n---QUESTÃO 5---\n");

        HashSet<String> frutas = new HashSet<>();
        frutas.addAll(List.of("Laranja", "Morango", "Maçã"));

        for(String fruta: frutas) {
            System.out.println(fruta);
        }

        /*6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        imprima o isEmpty() de novo.*/

        System.out.println("\n---QUESTÃO 6---\n");

        HashSet<Integer> numeros = new HashSet<>();

        System.out.println("Está vazio? " +  numeros.isEmpty());

        numeros.add(1);

        System.out.println("E agora, está vazio? " +  numeros.isEmpty());

    }
}
