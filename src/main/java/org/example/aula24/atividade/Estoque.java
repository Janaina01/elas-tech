package org.example.aula24.atividade;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ObservadorEstoque> observadoresEstoque = new ArrayList<ObservadorEstoque>();

    public void adicionarObservador(ObservadorEstoque observador) {
        this.observadoresEstoque.add(observador);
    }

    public void setQuantidade(int quantidade) {
        for (ObservadorEstoque observador : observadoresEstoque) {
            observador.atualizar(quantidade);
        }
    }
}
