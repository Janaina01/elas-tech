package org.example.aula21.atividade;

public class ManhaFacade {
    private Despertador desperador =  new Despertador();
    private Cafeteira cafeteira = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();

    public  void acordar(){
        desperador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
