package org.example.aula25.atividade;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AtividadeLambda2 {
    static void main() {

        System.out.println("\n---QUESTÃO 1 - Runnable---\n");

        /*1 - Runnable
        Runnable não recebe nada, não devolve nada.
        Crie uma Runnable que imprima "executando tarefa". Declare numa variável, execute com .run().
                Depois crie uma segunda Runnable e execute as duas em sequência no main.*/

        Runnable execucao1 = () -> System.out.println("Executando tarefa");
        execucao1.run();
        Runnable execucao2 = () -> System.out.println("Executando tarefa");
        execucao2.run();

        System.out.println("\n---QUESTÃO 2 - Consumer---\n");

        /*2 - Consumer
        Consumer algo entra, nada sai.
                Crie um Consumer<String> que receba um nome e imprima "Olá, " + nome.
                Use com .accept("Flora").
                Depois crie um segundo Consumer<String> que imprima o nome em maiúsculo.*/

        Consumer<String> saudacao = (nome) -> System.out.println("Olá, " + nome);
        saudacao.accept("Flora");

        Consumer<String> imprimeMaiusculo = (nome) -> System.out.println("Olá, " + nome.toUpperCase());
        imprimeMaiusculo.accept("Flora");

        System.out.println("\n---QUESTÃO 3 - Suplier---\n");

        /*3 - Supplier
        Supplier nada entra, algo sai
        Crie um Supplier<String> que devolva o texto "Aviso: O sistema está online!". Chame o metodo .get() e
        imprima o resultado.
        Crie um Supplier<Integer> que gere e devolva um número aleatório (use new Random().nextInt(100)).
        Chame o .get() duas vezes seguidas e imprima os resultados para ver que ele gera números diferentes
        a cada chamada.
         */

        Supplier<String> aviso = () -> "Aviso: O sistema está online!\n";
        System.out.println(aviso.get());

        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);
        System.out.println("Primeiro Número 0 a 100: " + geradorNumero.get());
        System.out.println("Segundo Número 0 a 100: " + geradorNumero.get());

        System.out.println("\n---QUESTÃO 4 - Predicate---\n");

        /*4 - Predicate
        Predicate entra algo, sai boolean
        Crie um Predicate<Integer> que teste se um número é maior que 10.
        Teste passando o número 5 e depois o número 15 usando o metodo .test().
        Imprima ambos os resultados na tela (true ou false).
        Crie um Predicate<String> que valide se um texto está vazio usando texto.isEmpty().
        Teste com uma String vazia "" e com uma String preenchida "Java".*/

        Predicate<Integer> maiorQueDez = (numero) -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15) + "\n");

        Predicate<String> textoVazio = (texto) -> texto.isEmpty();
        System.out.println("A String está vazia? " + textoVazio.test(""));
        System.out.println("E agora, a String está vazia? " + textoVazio.test("Java"));

        System.out.println("\n---QUESTÃO 5 - Function---\n");

        /*5 - Function
        Function entra um tipo, sai outro
        Crie uma Function<Integer, String> que receba um número e devolva o texto "Nota fiscal nº: " + numero.
        Use o metodo .apply(1542) e imprima o resultado.
        Crie uma Function<String, Integer> que receba uma palavra e devolva a quantidade de letras que ela tem
        usando .length(). Teste com .apply("Professor") e imprima o número gerado.*/

        Function<Integer, String> notaFiscal = (numero) -> "Nota fiscal nº: " + numero;
        String notaFormatada = notaFiscal.apply(1542);
        System.out.println(notaFormatada + "\n");

        Function<String, Integer> contadorLetras = (palavra) -> palavra.length();
        Integer totalLetras = contadorLetras.apply("Professor");
        System.out.println("A palavra \"Professor\" tem " + totalLetras + " letras.");

    }
}
