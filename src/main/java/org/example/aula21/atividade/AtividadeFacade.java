package org.example.aula21.atividade;

public class AtividadeFacade {
    static void main() {
        System.out.println("\nQuestão 7. Explique com suas palavras qual problema o Facade resolve. " +
                "Se quiser, use o exemplo do síndico do condomínio ou crie outro.");

        System.out.println("O Facade resolve o problema da complexidade de utilizar várias classes " +
                "para realizar uma operação. " +
                "Ele cria uma interface mais simples para acessar essas funcionalidades, " +
                "centralizando as chamadas necessárias. " +
                "\nAssim, a Main não precisa conhecer todos os detalhes do processo, " +
                "facilitando a organização e a manutenção do código.\n");

        System.out.println("Questão 8. Marque V (verdadeiro) ou F (falso):\n" +
                "• (F) A fachada precisa implementar uma interface.\n" +
                "• (V) A fachada guarda as classes envolvidas no processo em atributos.\n" +
                "• (F) Depois que a fachada existe, é proibido usar as outras classes diretamente.\n");

        System.out.println("---Questão 9---\n");

        /*Questão 9 (prática). Você já tem estas três classes:
        public class Despertador {
            public void desligar() {
                System.out.println("Despertador desligado.");
            }
        }
        public class Cafeteira {
            public void fazerCafe() {
                System.out.println("Café pronto.");
            }
        }
        public class Chuveiro {
            public void ligar() {
                System.out.println("Chuveiro ligado.");
            }
        }
        Crie a classe ManhaFacade com um método acordar() que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem.
                No main, use só a fachada: crie um objeto ManhaFacade e chame acordar().*/
        ManhaFacade manha = new ManhaFacade();
        manha.acordar();
    }
}
