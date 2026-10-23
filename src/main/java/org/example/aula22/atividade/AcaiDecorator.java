package org.example.aula22.atividade;

public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
            this.acaiEmbrulhado = acai;
    }
}
