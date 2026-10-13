package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

import static java.util.Collections.addAll;

public class AtividadeArrayDeque {
    static void main() {
        /*1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
        e quantas pessoas tem.*/

        System.out.println("\n---QUESTÃO 1---\n");

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Janaina", "Ana", "Jéssica"));

        System.out.println("Fila: " + fila);
        System.out.println("Quantidade de pessoas na fila: " + fila.size());

        /*2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        imprima a fila logo depois. Repare que ela não mudou.*/

        System.out.println("\n---QUESTÃO 2---\n");

        ArrayDeque<String> fila2 = new ArrayDeque<>();

        fila2.addAll(List.of("Janaina", "Ana", "Jéssica", "Claudete"));

        System.out.println("A próxima pessoa da fila é: " + fila2.peek());
        System.out.println(fila2);

        /*3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        depois. Compare com o exercício 2.*/

        System.out.println("\n---QUESTÃO 3---\n");

        fila2.poll();
        System.out.println("Fila depois de atender (usando poll): " + fila2);

        /*4. Crie uma fila com três nomes e atenda todos usando
        while (!fila.isEmpty()). No final, imprima "Fila vazia!".*/

        System.out.println("\n---QUESTÃO 4---\n");

        ArrayDeque<String> fila3 = new ArrayDeque<>();

        fila3.addAll(List.of("Janaina", "Ana", "Jéssica", "Claudete", "Joyce"));

        while (!fila3.isEmpty()){
            fila3.poll();
            System.out.println("Fila: " + fila3);
        }
        System.out.println("Fila vazia!");

        /*5. Crie uma fila com três nomes e use contains para responder duas
        perguntas: se "Bia" está na fila e se "Zoe" está.*/

        System.out.println("\n---QUESTÃO 5---\n");

        ArrayDeque<String> fila4 = new ArrayDeque<>();

        fila4.addAll(List.of("Janaina", "Ana", "Bia"));

        System.out.println("Bia está na fila? " + fila4.contains("Bia"));
        System.out.println("Zoe está na fila? " + fila4.contains("Zoe"));


        /*6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        - se estiver vazia  -> "Não tem ninguém na fila."
                - se tiver gente    -> "Próximo: [nome]"
        Depois adicione uma pessoa e teste de novo.*/

        System.out.println("\n---QUESTÃO 5---\n");

        ArrayDeque<String> fila5 = new ArrayDeque<>();

        //Depois do teste vazio, adicionando uma pessoa
        fila5.add("Joana");

        if(fila5.isEmpty()){
            System.out.println("Não tem ninguém na fila.");
        }else{
            System.out.println("Próximo: " + fila5.peek());
        }

    }
}
