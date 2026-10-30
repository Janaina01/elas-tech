package org.example.aula25.lambda4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda4 {
    static void main() {
        //Runnable
        //Runnable não recebe nada, não devolve nada.
        //Crie uma Runnable que imprima "executando tarefa". Declare numa variável, execute com .run().
        //Depois crie uma segunda Runnable e execute as duas em sequência no main.

        Runnable acao = () -> System.out.println("Executando tarefa");
        acao.run();

        //Consumer algo entra, nada sai.
        //Crie um Consumer<String> que receba um nome e imprima "Olá, " + nome.
        //Use com .accept("Flora").
        //Depois crie um segundo Consumer<String> que imprima o nome em maiúsculo, e use .andThen()
        // pra encadear os dois — repare que a ordem importa.

        Consumer<String> saudacao = (nome) -> System.out.println("Olá, " + nome);
        saudacao.accept("Flora");

        //Supplier nada entra, algo sai
        //Crie um Supplier<String> que devolva o texto "Aviso: O sistema está online!". Chame o metodo .get()
        // e imprima o resultado.
        //Crie um Supplier<Integer> que gere e devolva um número aleatório (use new Random().nextInt(100)).
        // Chame o .get() duas vezes seguidas e imprima os resultados para ver que ele gera
        // números diferentes a cada chamada.

        Supplier<String> avisoSistema = () -> "Aviso: O sistema está online!";
        System.out.println(avisoSistema.get());

        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);
        System.out.println("Primeira chamada: " + geradorNumero.get());
        System.out.println("Segunda chamada: " + geradorNumero.get());

        Predicate<Integer> maiorQueDez = (numero) -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15));

        Predicate<String> textoVazio = (texto) -> texto.isEmpty();
        System.out.println("A String \"\" está vazia? " + textoVazio.test(""));
        System.out.println("A String \"\" está vazia? " + textoVazio.test("Não"));

    }

}
