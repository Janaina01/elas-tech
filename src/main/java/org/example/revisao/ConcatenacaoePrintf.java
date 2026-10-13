package org.example.revisao;

public class ConcatenacaoePrintf {
    static void main() {
        //Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."

        System.out.println("\n--- QUESTÃO 1 ---\n");

        String nome = "Ana";
        int idade = 28;

        System.out.println(nome + " tem " +  idade + " anos.");

        //Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.

        System.out.println("\n--- QUESTÃO 2 ---\n");

        double nota1 = 8.0;
        double nota2 = 7.0;

        System.out.printf("A média das notas é: %.2f.", ((nota1 + nota2) / 2));

        //Crie uma variável com o preço de um produto e imprima com duas casas decimais.

        System.out.println("\n--- QUESTÃO 3 ---\n");

        double precoProduto = 150.90;

        System.out.printf("O preço do produto é de R$ %.2f.\n", precoProduto);

        //Usando printf, imprima numa linha só o nome, a idade e a altura.

        System.out.println("\n--- QUESTÃO 4 ---\n");

        String nome1 = "Ana";
        int idade1 = 28;
        double altura = 1.60;

        System.out.printf(nome + " tem " +  idade1 + " anos e %.2f de altura.", altura);

        /*🔥 Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo.
        Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
        💡 Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.*/

        System.out.println("\n--- DESAFIO ---\n");

        double total = 0;
        String produto1 = "Mouse";
        double preco1 = 89.90;
        total += preco1;

        String produto2 = "Teclado";
        double preco2 = 109.50;
        total += preco2;

        String produto3 = "Notebook";
        double preco3 = 1199.50;
        total += preco3;

        System.out.printf(produto1 + " --> R$ %.2f%n%s --> R$ %.2f%n%s --> R$ %.2f%nTotal: %.2f",
                preco1, produto2, preco2, produto3, preco3, total);




    }
}
