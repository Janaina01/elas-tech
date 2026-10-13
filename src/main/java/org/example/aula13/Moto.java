package org.example.aula13;

public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto desligada");
    }
    @Override
    public void acelerar() {
        System.out.println("Moto não está acelerando");
    }
}
