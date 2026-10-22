package org.example.aula21.atividade;

public class AtividadeAdapter {
    static void main() {
        System.out.println("\nQuestão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, " +
                "mas ela não implementa a sua interface. " +
                "Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?");
        System.out.println("R: Não podemos adicionar implements diretamente porque a classe pertence a outra empresa " +
                "e não temos controle sobre seu código. \n" +
                "Para resolver isso, criamos uma classe Adapter que implementa nossa interface e " +
                "faz a adaptação dos métodos, permitindo utilizar a classe externa sem precisar modificá-la.\n");


        System.out.println("Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?\n" +
                "• a) Na classe de fora\n" +
                "• b) Na interface\n" +
                "• c) No método implementado da interface, dentro do adapter\n" +
                "• d) No main, antes de chamar o método\n");
        System.out.println("R: c) No método implementado da interface, dentro do adapter.\n");

        System.out.println("---Questão 6---");

        /*Questão 6 (prática). O seu sistema usa esta interface:
        public interface Pagamento {
            void pagar();
        }
        Você recebeu esta classe de outra empresa. Ela não pode ser alterada:
        public class PayPalAPI {
            public void sendPayment() {
                System.out.println("Pagamento enviado pelo PayPal.");
            }
        }
        Crie a classe PayPalAdapter, para que o sistema consiga usar o PayPal como um Pagamento. Não precisa fazer nenhuma conversão: o método pagar() só precisa chamar o método da classe de fora.
                No main:
        1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
        2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().*/

        //Pagamento pagamento = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter();
        pagamento.pagar();

    }
}
