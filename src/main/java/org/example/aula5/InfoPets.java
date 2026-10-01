package org.example.aula5;

public class InfoPets {
    static void main() {
        Pet cachorro =  new Pet();
        cachorro.nome = "Bob";
        cachorro.raca = "Poodle";
        cachorro.peso = 8.5;

        Pet gato =  new Pet();
        gato.nome = "Frajola";
        gato.raca = "Siamês";
        gato.peso = 5.0;

        System.out.println("O primeiro pet é um cachorro chamado " + cachorro.nome + " da raça " +  cachorro.raca
                + " e pesa " + cachorro.peso + " Kg.");
        System.out.println("O segundo pet é um gato chamado " + gato.nome + " da raça "
                + gato.raca + " e pesa " + gato.peso + " Kg.");
    }

}
