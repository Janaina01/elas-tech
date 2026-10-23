package org.example.aula22.atividade;

public class Morango extends AcaiDecorator {
    public Morango(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 3.50;
    }
}
