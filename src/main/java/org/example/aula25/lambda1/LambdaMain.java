package org.example.aula25.lambda1;

import org.example.aula25.lambda2.Acao;
import org.example.aula25.lambda2.Operacao;

public class LambdaMain {
    public static void mostrarTexto(){
        System.out.println("Oii");
    }

    public static void repetirAcao(Acao acao){
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }

    static void main() {

        //Lambda1
        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

        mostrarTexto();

        Impressora maiusculo = (texto) -> System.out.println(texto.toUpperCase());
        maiusculo.imprimir("Bom dia!");

        Impressora minusculo = (texto) -> System.out.println(texto.toLowerCase());
        minusculo.imprimir("BOa noite!");

        //Interface Calculo com int calcular(int a, int b).
        //Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois. Chame as três e imprima os resultados.

        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a,b) -> a > b ? a : b;
        //Calculo maior2 = (a,b) -> Math.max(a,b);     Outra forma de verificar valor maior

        System.out.println("Soma: " + soma.calcular(2,10));
        System.out.println("Multiplicação: " + multiplicacao.calcular(2,10));
        System.out.println("Maior valor: " + maior.calcular(2,10));

        //Lambda2

        //Interface Acao com void executar().
        //Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
        //No main, chame repetir passando uma lambda que imprime "oi".
        //Repare que você não cria variável, a lambda vai direto como argumento.

        repetirAcao(() -> System.out.println("Oi"));

        mostrarResultado((valor) -> valor*2, 5);



    }
}
