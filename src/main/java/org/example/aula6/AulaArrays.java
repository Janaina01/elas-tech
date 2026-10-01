package org.example.aula6;

public class AulaArrays {
    static void main() {
        int[] notas = {3, 4, 7, 9, 10, 12, 88, 4};
        int[] outrasNotas = new int[3];

        System.out.println(notas.length);

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
