package org.example.revisao;

public class TesteRevisaoMetodos {
    static void main() {
        /*💡 Lembrete: se for criar e chamar os métodos dentro do mesmo arquivo onde está o main,
    não esqueça de colocar a palavra static antes deles (ex: static void mostrarBoasVindas()).*/

        //Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.

        System.out.println("\n--- QUESTÃO 1 ---\n");

        RevisaoMetodos.mostrarBoasVindas();

        //Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        RevisaoMetodos.saudacao("Maria");
        RevisaoMetodos.saudacao("João");
        RevisaoMetodos.saudacao("Marina");


        //Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        System.out.println(RevisaoMetodos.dobro(10));

        //Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        System.out.printf("Valor da média: %.2f", RevisaoMetodos.calcularMedia(10.5,59.9));

        //Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.

        System.out.println("\n--- QUESTÃO 5 ---\n");

        if(RevisaoMetodos.ehPar(10)){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }

        //Crie dois métodos somar: um que recebe dois números e outro que recebe três.

        System.out.println("\n--- QUESTÃO 6 ---\n");

        System.out.println(RevisaoMetodos.somar(10,10));
        System.out.println(RevisaoMetodos.somar(10,10, 10));

        /*🔥 Mini-desafio — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false.
             Depois crie outro método, liberarEntrada(int idade),
             que chama o primeiro e imprime se a pessoa pode entrar ou não. No main, chame apenas o segundo.

        💡 Um método pode chamar outro normalmente, basta escrever o nome dele.
             E como o primeiro devolve true ou false, esse resultado pode ir direto dentro de um if.*/

        System.out.println("\n--- DESAFIO! ---\n");

        RevisaoMetodos.liberarEntrada(22);


    }


}
