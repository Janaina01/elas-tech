package org.example.aula24.atividade;

import java.util.ArrayList;

public class Voo {
    private ArrayList<ObservadorVoo> observadores = new ArrayList<ObservadorVoo>();

    public void  adicionarObservador(ObservadorVoo o){
        this.observadores.add(o);
    }

    public void mudarStatus(String status){
        for(ObservadorVoo observador : observadores){
            observador.atualizar(status);
        }

    }

}
