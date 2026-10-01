package org.example.aula3;

public class OperadoresRelacionais {

    static void main() {

        // Questão 1
        int a = 10;
        int b = 3;

        System.out.println("a = 10 e b = 3");
        System.out.println("São iguais: " + (a == b));
        System.out.println("São diferentes: " + (a != b));
        System.out.println("A primeira é maior: " + (a > b));
        System.out.println("A primeira é menor: " + (a < b));

        a = 3;
        b = 10;

        System.out.println("a = 3 e b = 10");
        System.out.println("São iguais: " + (a == b));
        System.out.println("São diferentes: " + (a != b));
        System.out.println("A primeira é maior: " + (a > b));
        System.out.println("A primeira é menor: " + (a < b));

        a = 5;
        b = 5;

        System.out.println("a = 5 e b = 5");
        System.out.println("São iguais: " + (a == b));
        System.out.println("São diferentes: " + (a != b));
        System.out.println("A primeira é maior: " + (a > b));
        System.out.println("A primeira é menor: " + (a < b));


        // Questão 2
        a = 10;
        b = 3;

        System.out.println("a == b: " + (a == b));


        // Questão 3
        System.out.println("a != b: " + (a != b));


        // Questão 4
        boolean chovendo = true;

        System.out.println("!chovendo: " + !chovendo);
    }
}
