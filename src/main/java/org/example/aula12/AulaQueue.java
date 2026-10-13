package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    static void main() {
        /*
        .add("Ana");
        .peek(); --> checagem
        .poll(); --> retira primeiro da fila
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */

        //Quando vamos manipular apenas primeiros e últimos de listas, usamos ArrayDeque

        ArrayDeque<String> fila = new ArrayDeque<>();
        if(fila.isEmpty() != true) {

        } else {
            fila.add("Flora");
            fila.add("Ana");
            fila.addAll(List.of("Maria", "Natália", "Jamily", "Kerou", "Giovanna"));
            System.out.println(fila);
            System.out.println(fila.peek());
            System.out.println(fila.poll());
            System.out.println(fila);
            fila.poll();
            System.out.println(fila);

            if(fila.isEmpty() == true) {

            }
        }



    }
}
