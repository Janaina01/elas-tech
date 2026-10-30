package org.example.aula25.atividade;

import java.util.Locale;

public class AtividadeLambda {

    public static void repetir(Acao acao){
        acao.executar();
        acao.executar();
    }
    public static void mostrarResultado(Operacao op, int valor){

        System.out.println(op.aplicar(valor));
    }

    public static void executarSe(Condicao cond, int valor, Acao acao){
        if (cond.testar(valor)){
            acao.executar();
        }
    }

    static void main() {

        System.out.println("\n---QUESTÃO 1---\n");

        //Crie uma interface Saudacao com um metodo void executar().
        //Depois, em uma classe com main, crie uma variável desse tipo usando lambda e chame o metodo. O corpo da lambda deve imprimir "oi".
        Saudacao saudacao1 = () -> System.out.println("oi");
        saudacao1.executar();

        System.out.println("\n---QUESTÃO 2---\n");

        //Interface Impressora com void imprimir(String texto).
        //Crie duas variáveis diferentes desse tipo usando duas lambdas — uma que imprime o texto em maiúsculo,
        // outra que imprime em minúsculo. Chame as duas.

        Impressora imprimeMaiusculo = (texto) -> System.out.println(texto.toUpperCase());
        imprimeMaiusculo.imprimir("Texto em Maiúsculo");

        Impressora imprimeMinusculo = (texto) -> System.out.println(texto.toLowerCase());
        imprimeMinusculo.imprimir("Texto em Minúsculo");

        System.out.println("\n---QUESTÃO 3---\n");

        //Interface Calculo com int calcular(int a, int b).
        //Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois.
        // Chame as três e imprima os resultados.

        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a,b) -> Math.max(a,b);

        System.out.println("Soma: " + soma.calcular(5,10));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5,10));
        System.out.println("Maior valor: " + maior.calcular(5,10));

        System.out.println("\n---QUESTÃO 4---\n");

        //Antes eu guardava a ação e chamava. Agora eu entrego a ação e deixo o metodo decidir o que fazer com ela.

        //Interface Acao com void executar().
        //Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
        //No main, chame repetir passando uma lambda que imprime "oi".
        //Repare que você não cria variável, a lambda vai direto como argumento.

        repetir(() -> System.out.println("oi"));

        System.out.println("\n---QUESTÃO 5---\n");

        //Interface Operacao com int aplicar(int n).
        //Crie um metodo static void mostrarResultado(Operacao op, int valor) que imprime o retorno de op.aplicar(valor).
        //No main, chame mostrarResultado três vezes com três lambdas diferentes: dobro, quadrado e negativo.
        //Aqui você vê lambda com retorno entrando por parâmetro — as duas coisas juntas.

        mostrarResultado((valor)-> valor * 2,5);
        mostrarResultado((valor)-> valor * valor,5);
        mostrarResultado((valor)-> -valor,5);

        System.out.println("\n---QUESTÃO 6---\n");

        //Interface Condicao com boolean testar(int n).
        //Crie um metodo static void executarSe(Condicao cond, int valor, Acao acao) — se cond.testar(valor) for true, chama acao.executar().
        //No main, chame passando: uma condição “é par”, o valor 4, e uma ação que imprime "é par!".
        // Depois chame de novo com valor 7 e veja que nada acontece.

        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!"));
        //com 7, nada acontece porque é impar e não foi criada condição para esse caso
        //seria necessário criar uma nova ação para ímpar
    }
}
