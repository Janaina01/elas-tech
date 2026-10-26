package org.example.aula23.tdd;

public class AtividadeTestesUnitarios {
    static void main() {
        System.out.println("1.(Cenário Real) A equipe mexeu na classe CalculadoraFrete para adicionar entrega por Drone," +
                " mas sem querer estragou o cálculo antigo do Sedex. " +
                "Qual é a principal vantagem de ter Testes Unitários nesse momento?\n" +
                "A) O teste unitário corrige o código do Sedex sozinho usando Inteligência Artificial.\n" +
                "B) O teste apita Vermelho imediatamente na máquina da programadora antes de o bug ir para o cliente " +
                "(evitando regressão).\n" +
                "C) O teste substitui a necessidade de usar interfaces e princípios S.O.L.I.D. no projeto.\n" +
                "D) O teste deixa o banco de dados do sistema duas vezes mais rápido.\n");

        System.out.println("R: B) O teste apita Vermelho imediatamente na máquina da programadora antes " +
                "de o bug ir para o cliente (evitando regressão).\n");

        System.out.println("2. Olhando para a Pirâmide de Testes, por que os Testes Unitários ficam na base " +
                "(representando cerca de 70% dos testes de uma empresa)?\n" +
                "A) Porque eles testam a tela inteira clicando nos botões como um humano.\n" +
                "B) Porque eles exigem que o banco de dados oficial esteja ligado.\n" +
                "C) Porque eles testam pequenas partes isoladas do código, rodando em milissegundos e " +
                "sendo muito mais baratos e fáceis de manter.\n" +
                "D) Porque são feitos manualmente usando System.out.println no main.\n");

        System.out.println("R: C) Porque eles testam pequenas partes isoladas do código, rodando em milissegundos e " +
                "sendo muito mais baratos e fáceis de manter.\n");

        System.out.println("3. No JUnit 5, nós organizamos nosso método de teste seguindo o padrão AAA " +
                "(Arrange, Act, Assert). O que fazemos na etapa \"Assert\"?\n" +
                "A) Damos new na classe que queremos testar e preparamos as variáveis.\n" +
                "B) Usamos os comandos do JUnit (como assertEquals ou assertTrue) " +
                "para verificar se o resultado obtido bateu com o esperado.\n" +
                "C) Apagamos os dados do banco de dados após o teste terminar.\n" +
                "D) Imprimimos o resultado no console com System.out.println para conferir no olho.\n");

        System.out.println("R: B) Usamos os comandos do JUnit (como assertEquals ou assertTrue)" +
                "para verificar se o resultado obtido bateu com o esperado.\n");

        System.out.println("4. Qual comando do JUnit 5 você deve usar para garantir que o método conta.sacar(-50.0) " +
                "bloqueia a operação lançando uma exceção (IllegalArgumentException)?\n" +
                "A) assertEquals(-50.0, conta.sacar(-50.0));\n" +
                "B) assertFalse(conta.sacar(-50.0));\n" +
                "C) assertNull(conta.sacar(-50.0));\n" +
                "D) assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0));\n");

        System.out.println("R: D) assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0));\n");

        System.out.println("5. No TDD (Test-Driven Development), trabalhamos no ciclo Red ➡\uFE0F Green ➡\uFE0F " +
                "Refactor. O que significa a etapa \"GREEN\" (Verde)?\n" +
                "A) Escrever o teste primeiro e ver ele falhar porque a classe ainda não existe.\n" +
                "B) Escrever o código mais simples e direto possível na classe principal apenas para fazer o teste " +
                "passar e ficar verde.\n" +
                "C) Limpar o código, tirar repetições e aplicar boas práticas sem alterar o resultado.\n" +
                "D) Enviar o código direto para o servidor de produção sem testar.\n");

        System.out.println("R: B) Escrever o código mais simples e direto possível na classe principal " +
                "apenas para fazer o teste passar e ficar verde.\n");

        System.out.println("6. Responda:Na sinceridade: Por que testar o sistema apenas dando System.out.println() " +
                "dentro do método main (\"teste no olho\") não funciona quando o projeto cresce na empresa?" +
                "\nDetetive de Código: Uma colega escreveu um método de teste perfeito com assertEquals,0" +
                " clicou para rodar a classe de teste, mas o JUnit ignorou o método dela completamente! " +
                "\nQual anotação ela esqueceu de colocar em cima do método?\nRefatoração sem medo: " +
                "No ciclo do TDD, por que a gente só faz o Refactor (deixar o código bonito e limpo) " +
                "depois que o teste já ficou Verde?\n");

        System.out.println("R: Conforme o projeto cresce, fica difícil verificar manualmente todas as funcionalidades.\n" +
                "Com os testes unitários, é possível realizar várias verificações automaticamente, identificar erros e" +
                " evitar regressões.\n" +
                "Detetive de Código: A colega esqueceu de utilizar a anotação @Test, do JUnit. Sem essa anotação," +
                " o JUnit não reconhece o método como teste.\n" +
                "Refatoração sem medo: Porque primeiro precisamos garantir que o código funciona e atende ao esperado." +
                "\nDepois podemos melhorar e organizar o código sem alterar o funcionamento.\n");

        System.out.println("---QUESTÃO 6---");
        /*/Atividade Prática: Meu Primeiro TDD com JUnit 5/
         Mão na massa: A Calculadora de Descontos
        Vamos desenvolver uma classe CalculadoraDesconto usando os 3 passos (AAA) do JUnit!

        Regras de Negócio que nossa classe deve ter:
        Método aplicarDesconto(double valorCompra, boolean clienteVip):
        Se a compra for menor que R$ 100,00 e o cliente não for VIP, não tem desconto (retorna o próprio valorCompra).
        Se o cliente for VIP, ganha 10% de desconto em qualquer valor (multiplica por 0.90).
        Se o valorCompra passado for zero ou negativo (<= 0), deve lançar um erro: IllegalArgumentException.


        Sua Missão na classe CalculadoraDescontoTest:Teste 1 (@Test): Prepare uma compra de R$ 50.0 para cliente comum
        (false) e use assertEquals para garantir que retorna 50.0.Teste 2 (@Test): Prepare uma compra de R$ 200.0 para
        cliente VIP (true) e use assertEquals para garantir que retorna 180.0.Teste 3 (@Test):
        Use assertThrows para garantir que passar -10.0 lança IllegalArgumentException!      */


    }
}
