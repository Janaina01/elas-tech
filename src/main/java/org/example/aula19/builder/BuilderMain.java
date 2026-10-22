package org.example.aula19.builder;

public class BuilderMain {
    static void main() {
        Pizza pizza = Pizza.builder().borda("Catupiry").sabor("Marguerita").temQueijo(true).build();

        System.out.println(pizza);


    }

}
