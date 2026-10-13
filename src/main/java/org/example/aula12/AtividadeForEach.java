package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

public class AtividadeForEach {
    public static void main(String[] args) {
        /*        Referência:
        For-each:
        for (tipo apelido : coleção) {

        }
        Array normal:
        String[] nomeDoArray = {"Ana", "Maria"};

        ArrayList:
        ArrayList<String> lista = new ArrayList<>();*/


        /*1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
                um por linha.*/

        System.out.println("\n---QUESTÃO 1---\n");

        String[] nomes = {"Maria", "Pamela", "Vanessa", "Joana"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        //2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

        System.out.println("\n---QUESTÃO 2---\n");

        ArrayList<Integer> notas = new ArrayList<>();

        notas.addAll(List.of(8, 10, 7, 8, 9));

        for (Integer nota : notas) {
            System.out.println(nota);
        }


        /*3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
        todas e mostrar a soma e a média.*/

        System.out.println("\n---QUESTÃO 3---\n");

        int[] notaAlunos = {8, 6, 10, 7};

        int soma = 0;

        for (int notaAluno : notaAlunos) {
            soma += notaAluno;
            System.out.println("Nota: " + notaAluno + " | Soma: " + soma);
        }
        double media = (double) soma / notaAlunos.length;

        System.out.printf("Soma das notas: %d\nMédia: %.2f", soma, media);

        /*4. Com um array de nomes, use for-each e um if para contar quantos
        têm mais de 5 letras. Mostre o total. Dica: usem o método length.*/

        System.out.println("\n---QUESTÃO 4---\n");

       String[] nomesPessoas = {"Maria", "Pamela", "Vanessa", "Joana"};

        int contador = 0;

        for (String nomePessoa : nomesPessoas) {
            if (nomePessoa.length() > 5) {
                contador ++;
                System.out.println(nomePessoa);
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: " + contador);

        /*5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
                usando o índice. Deixe os dois na mesma classe e compare.*/

        System.out.println("\n---QUESTÃO 5---\n");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }




    }

}
