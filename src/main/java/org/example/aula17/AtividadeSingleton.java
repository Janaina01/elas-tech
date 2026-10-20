package org.example.aula17;

public class AtividadeSingleton {
    static void main() {
        System.out.println("1. O que o padrão Singleton garante?");
        /*a) Que a classe tenha vários construtores
        b) Que exista apenas um objeto da classe no programa
        c) Que a classe não tenha atributos
        d) Que a classe possa ser herdada*/
        System.out.println("R: b) Que exista apenas um objeto da classe no programa\n");

        System.out.println("2. Por que o construtor de um Singleton é private?");
        System.out.println("R: Porque o objetivo é garantir que exista apenas uma instância da classe, " +
                "impedindo que outras classes criem novos objetos usando new.\n");

        System.out.println("3. Complete a lacuna:\n" +
                              "java\n" +
                "private ______ Configuracao instancia;");
        /*a) final
        b) public
        c) static
        d) void*/
        System.out.println("R: c) static\n");

        System.out.println("4. O que acontece se alguém tentar escrever isto fora da classe?\n" +
                "java\n" +
                "Configuracao c = new Configuracao();");

        System.out.println("R: Dará erro de compilação, porque o construtor é private, " +
                "impedindo a criação de um novo objeto fora da classe. " +
                "O Singleton controla a criação de uma única instância.\n");

        System.out.println(" 5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?");
        /*a) new Configuracao()
        b) Configuracao.getInstancia()
        c) Configuracao.instancia
        d) this.getInstancia()*/

        System.out.println("R: b) Configuracao.getInstancia()");

        System.out.println("---Questão 6---\n");

        /*6.  Crie uma classe Singleton chamada ContadorVisitas que:
        -tenha um atributo total, começando em 0;
        -tenha um método registrarVisita() que soma 1 ao total;
        -tenha um método getTotal() que devolve o total.

        Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2, registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as duas variáveis usam o mesmo contador.

        Exemplo de saída esperada:

        Total de visitas: 3

        Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();*/

        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();


        System.out.println("Total de visitas: " + pagina2.getTotal());

        System.out.println("---Questão 7---\n");

        /*7. Crie uma classe Singleton chamada Carrinho que:
        -tenha um atributo quantidadeItens, começando em 0;
        -tenha um método adicionarItem() que soma 1 à quantidade;
        -tenha um método getQuantidadeItens() que devolve a quantidade.

        No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.

        Exemplo de saída esperada:

        Itens no carrinho: 4*/
    }
}
