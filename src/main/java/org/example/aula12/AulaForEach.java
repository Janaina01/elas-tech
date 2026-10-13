package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

public class AulaForEach {
    static void main() {
        //ForEach não serve caso você for realizar alguma modificação no seu ArrayList
        //Você não sabe em qual posição você está (bom para HashSet)
        //Não dá para alterar o array original
        //Só anda para frente de um a um
        //Serve para olhar, comparar, exibir ou somar itens da lista.

        ArrayList<String> animais = new ArrayList<>(List.of("Macaco", "Leão", "Guaxinim"));

        /*for(int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        }*/

        for(String animal : animais) {
            System.out.println(animal);
        }
    }
}
