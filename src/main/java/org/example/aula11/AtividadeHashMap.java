package org.example.aula11;

import java.util.HashMap;
import java.util.Map;

public class AtividadeHashMap {
    static void main() {
        /*1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        inteiro e depois use get para mostrar a idade de uma delas.*/

        System.out.println("\n---QUESTÃO 1---\n");

        HashMap<String, Integer> idadesPessoas = new HashMap<>();

        idadesPessoas.putAll(Map.of("Janaina", 28, "Ana", 11, "Fabiana", 22));

        System.out.println(idadesPessoas);
        System.out.println("A idade de Ana é " +  idadesPessoas.get("Ana"));


        /*2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
                imprima, e depois faça put de "café" DE NOVO com valor 7.50.
                Imprima outra vez e veja o que aconteceu com o tamanho.*/

        System.out.println("\n---QUESTÃO 2---\n");

        HashMap<String, Double> produtosPrecos = new HashMap<>();

        produtosPrecos.put("Café", 5.00);
        System.out.println(produtosPrecos);

        produtosPrecos.put("Café", 7.50);
        System.out.println(produtosPrecos);
        System.out.println(produtosPrecos.size());

        /*3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
        dentro de um if para mostrar o telefone de alguém que está na agenda
        e de alguém que não está.*/

        System.out.println("\n---QUESTÃO 3---\n");

        HashMap<String, String> agenda = new HashMap<>();

        agenda.putAll(Map.of("Janaina", "6236553172","Eduardo", "7938795645"));

        String chave = "Janaina";

        if(agenda.containsKey(chave)) {
            System.out.println("O telefone da " + chave + " é: " + agenda.get(chave));
        } else {
            System.out.println("Este contato não está na agenda.");
        }

        /*4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
                Use getOrDefault para mostrar a quantidade de um produto que existe
        e de um que não existe (devolvendo 0). Depois tente com get normal
        no que não existe e compare.*/

        System.out.println("\n---QUESTÃO 4---\n");

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.putAll(Map.of("Pão", 220, "Mostarda", 110));

        System.out.println("Quantidade de um produto que existe (usando getOrDefault): " + estoque.getOrDefault
                ("Mostarda", 110));
        System.out.println("Quantidade de um produto que não existe (usando getOrDefault): " + estoque.getOrDefault
                ("Ketchup", 110));
        System.out.println("Quantidade de um produto que não existe (usando get): " + estoque.get("Ketchup"));


        /*5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
        Remova uma delas e imprima de novo.*/

        System.out.println("\n---QUESTÃO 5---\n");

        HashMap<String, Double> boletim = new HashMap<>();

        boletim.putAll(Map.of("Maria", 10.00, "Pamela", 7.9, "Vanessa", 9.5));

        System.out.println("Mapa: " + boletim);
        System.out.println("Tamanho: " + boletim.size());

        boletim.remove("Pamela");
        System.out.println("Mapa depois de remover: " + boletim);
    }
}
