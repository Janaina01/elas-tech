package org.example.aula21.atividade;

public class AtividadeFactory {
    static void main() {
        System.out.println("Questão 1. Explique com suas palavras qual problema o Factory resolve. " +
                "O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e " +
                "por outras partes do programa, e depois surgisse um tipo novo?");
        System.out.println("R: O Factory resolve o problema de ter que criar objetos em várias partes do código. +" +
                "Se os if/else ficassem espalhados pelo main e por outras classes, seria mais difícil realizar a manutenção." +
                "O Factory facilita a organização, manutenção e a reutilização do código.\n");


        System.out.println("Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo?\n" +
                "• a) O tipo da classe concreta (ex.: Cachorro)\n" +
                "• b) O tipo da interface (ex.: Animal)\n" +
                "• c) String\n" +
                "• d) Não devolve nada (void)\n");
        System.out.println("R: b) O tipo da interface (ex.: Animal)\n");


        System.out.println("---Questão 3---");

        /*Questão 3 (prática). Implemente a interface e as classes abaixo:

        public interface Animal {
            void emitirSom();
        }


        public class Cachorro implements Animal {
            @Override
            public void emitirSom() {
                System.out.println("Au au!");
            }
        }


        public class Gato implements Animal {
            @Override
            public void emitirSom() {
                System.out.println("Miau!");
            }
        }


        Crie a classe AnimalFactory com um método getAnimal(String tipo):
        • se o tipo for "cachorro", devolve um Cachorro;
        • se o tipo for "gato", devolve um Gato.
        No main, use a fábrica para criar um cachorro e um gato e chame emitirSom() nos dois. O main não pode ter new Cachorro() nem new Gato().*/

        Animal cachorro = AnimalFactory.getAnimal("Cachorro");
        Animal gato = AnimalFactory.getAnimal("Gato");

        cachorro.emitirSom();
        gato.emitirSom();

    }
}
