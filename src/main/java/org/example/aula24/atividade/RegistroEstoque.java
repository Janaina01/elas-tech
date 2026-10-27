package org.example.aula24.atividade;

public class RegistroEstoque implements ObservadorEstoque {
    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}
