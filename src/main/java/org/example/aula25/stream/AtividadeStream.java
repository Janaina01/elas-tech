package org.example.aula25.stream;

import java.util.List;

public class AtividadeStream {
    static void main() {

        System.out.println("\n---QUESTÃO 1---\n");

        /*1 - Dada uma lista de números inteiros de 1 a 6, use Streams para filtrar apenas os números pares e
        salve o resultado em uma nova lista.
         */

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> numerosPares = numeros.stream()
                        .filter(n -> n % 2 == 0)
                        .toList();
        System.out.println("Lista de números pares: " + numerosPares);

        System.out.println("\n---QUESTÃO 2---\n");

        /*2 - Dada uma lista com nomes de frutas em letras minúsculas,
        use o map para transformar todas as palavras em letras maiúsculas e imprima cada uma na tela.
         */

        List<String> frutas = List.of("banana", "maçã", "morango");

        frutas.stream()
                        .map(fruta -> fruta.toUpperCase())
                        .forEach(System.out::println);

        System.out.println("\n---QUESTÃO 3---\n");

        /*3 - Dada uma lista de nomes de cidades, filtre apenas as cidades que começam com a letra "S" e
        conte quantas cidades passaram pelo filtro.
         */

        List<String> cidades = List.of("São Paulo", "Campinas", "Curitiba", "Santos");

        int quantidade = (int) cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();

        System.out.println("Quantidade de cidades que começam com a letra \"S\": " + quantidade);
    }
}
