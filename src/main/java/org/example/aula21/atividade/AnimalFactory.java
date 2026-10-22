package org.example.aula21.atividade;

public class AnimalFactory {

    public static Animal getAnimal(String tipo){

        switch (tipo.toLowerCase()){
            case "cachorro":
                return new Cachorro();

            case "gato":
                return new Gato();

            default:
                throw new IllegalArgumentException("Animal inexistente.");
        }

    }
}
