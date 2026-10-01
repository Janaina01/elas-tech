package org.example.aula6;

public class EstruturasRepeticao {
    static void main() {
        //Questão 1

        /*for (int i = 1; i <= 30; i++) {
            System.out.println(i);}*/

        //Questão 2
            /*for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        System.out.println("Fim");*/

        //Questão 3
        /*int contador = 1;
        while (contador <= 30) {
            System.out.println(contador);
            contador++;
        }*/

        //Questão 4

    System.out.println("Tabuada do número 3:");

        int numero = 3;

        for(int i = 1; i <= 10; i++ ) {
            int tabuada = i *  numero;
            System.out.println("3 x " + i + " = " + tabuada);

        }

    }
}
