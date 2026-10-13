package org.example.revisao;

public class TesteClasseObjetos {
    public static void main(String[] args) {

        //Crie uma classe Pet com nome, raca e peso. Em outra classe, crie um objeto, preencha e imprima tudo.

        System.out.println("\n--- QUESTÃO 1 e 2 ---\n");

        Pet pet1 = new Pet();

        pet1.nome = "Bob";
        pet1.raca = "Poodle";
        pet1.peso = 10.5;

        System.out.println("O primeiro pet se chama " + pet1.nome + ", é da raça " +  pet1.raca + " e pesa "
                +  pet1.peso + " Kg.");

        //Continuando, crie dois pets diferentes e imprima as duas fichas.

        Pet pet2 = new Pet();
        pet2.nome = "Maya";
        pet2.raca = "Border Collie";
        pet2.peso = 15.5;

        System.out.println("O segundo pet se chama " + pet2.nome + ", é da raça " +  pet2.raca + " e pesa "
                +  pet2.peso + " Kg.");

        //Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        Produto produto1 = new Produto();

        produto1.nome = "Barra de cereal";
        produto1.preco = 2.99;
        produto1.quantidade = 100;


        System.out.println("Valor total em estoque: R$ " + produto1.total());

        //Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        Aluna aluna1 = new Aluna();
        aluna1.nome = "Maria";
        aluna1.nota1 = 6;
        aluna1.nota2 = 8.5;

        System.out.printf("A aluna %s obteve as notas: %.2f e %.2f. Sua média foi: %.2f", aluna1.nome, aluna1.nota1, aluna1.nota2, aluna1.media());

        /*🔥 Mini-desafio — Crie uma classe Jogadora com nome e pontos.
        Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação. Imprima o nome dela.

        💡 Compare os atributos pontos de cada objeto, igual você compararia números comuns.
        Guarde numa variável o nome da jogadora com a maior pontuação encontrada até agora.*/

        System.out.println("\n--- DESAFIO! ---\n");

        Jogadora jogadora1 = new Jogadora();
        jogadora1.nome = "Maria";
        jogadora1.pontos = 85;

        Jogadora jogadora2 = new Jogadora();
        jogadora2.nome = "Joana";
        jogadora2.pontos = 89;

        Jogadora jogadora3 = new Jogadora();
        jogadora3.nome = "Marta";
        jogadora3.pontos = 100;

        int maiorPontuacao = jogadora1.pontos;
        String nomeVencedora = jogadora1.nome;

        if(jogadora2.pontos > maiorPontuacao) {
            maiorPontuacao = jogadora2.pontos;
            nomeVencedora = jogadora2.nome;
        } else if(jogadora3.pontos > maiorPontuacao) {
            maiorPontuacao = jogadora3.pontos;
            nomeVencedora = jogadora3.nome;
        }

        System.out.printf("A jogadora com maior pontuação foi a %s com %d pontos.",  nomeVencedora, maiorPontuacao);



    }

}
