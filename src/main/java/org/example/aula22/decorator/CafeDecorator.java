package org.example.aula22.decorator;

abstract class CafeDecorator implements Cafe {
    protected Cafe cafeEmbrulhado;


    public CafeDecorator(Cafe cafe) {
        this.cafeEmbrulhado = cafe;

    }
}
