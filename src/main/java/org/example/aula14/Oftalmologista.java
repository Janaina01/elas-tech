package org.example.aula14;

public class Oftalmologista extends Medicos {
    void examinarOlhos(){

    }
    void passarOculos(){

    }
    @Override
    void fazerCirurgia(){
        System.out.println("Cortar o olho");
    }

    //Polimorfismo dinâmico

    static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static double soma(double numero1, double numero2){
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println(soma(123, 54));
    }
}
