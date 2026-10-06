package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaArrayList {
    static void main() {

        /*.add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());*/

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1000);

        lista.add(2,77);
        lista.addAll(List.of(1, 2, 32, 6, 765, 234, 9));

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.get(2));

        lista.set(0, 98);
        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.contains(98));
        System.out.println(lista.indexOf(98));
        System.out.println(lista.isEmpty());


    }
}
