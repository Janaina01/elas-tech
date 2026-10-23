package org.example.aula22.atividade;

public class AtividadeDecorator {
    static void main() {
        System.out.println("\nQuestão 1. Uma açaiteria vende açaí com qualquer combinação de adicionais: " +
                "granola, leite ninho, morango, paçoca. " +
                "Por que criar uma classe para cada combinação " +
                "(AcaiComGranola, AcaiComGranolaEMorango, AcaiComMorangoEPacoca...) é um problema? " +
                "O que o Decorator faz no lugar?");
        System.out.println("R: Criar uma classe para cada combinação faria o sistema ter muitas classes e " +
                "seria difícil de manter. " +
                "\nO Decorator permite criar os adicionais separadamente e combiná-los conforme necessário, " +
                "sem precisar criar uma classe para cada combinação possível.\n");

        System.out.println("Questão 2. Em um Decorator, por que a classe AcaiDecorator tem implements Acai?\n" +
                "a) Para poder ser criada com new\n" +
                "b) Para que um adicional também conte como açaí e possa ir dentro de outro adicional\n" +
                "c) Para herdar o preço do açaí simples\n" +
                "d) Para não precisar usar o super\n");
        System.out.println("R: b) Para que um adicional também conte como açaí e possa ir dentro de outro adicional");

        /*Questão 3 (prática). O seu sistema já tem esta interface e estas duas classes:

        public interface Acai {
            String getDescricao();
            double getPreco();
        }

        public class AcaiSimples implements Acai {
            public String getDescricao() {
                return "Açaí Simples";
            }

            public double getPreco() {
                return 12.00;
            }
        }

        public abstract class AcaiDecorator implements Acai {
            protected Acai acaiEmbrulhado;

            public AcaiDecorator(Acai acai) {
                this.acaiEmbrulhado = acai;
            }
        }

        No main:

        Crie um açaí só com granola e imprima a descrição e o preço.
        Crie um açaí com granola e morango (um adicional embrulhando o outro) e imprima a descrição e o preço.*/

        Acai acaiG = new Granola(
                new AcaiSimples()
        );

        System.out.printf(acaiG.getDescricao() + "\nR$ %.2f%n", acaiG.getPreco());

        Acai acaiGM =  new Granola(
                new Morango(
                        new AcaiSimples()
                )
        );

        System.out.printf(acaiGM.getDescricao() + "\nR$ %.2f%n", acaiGM.getPreco());

    }
}
