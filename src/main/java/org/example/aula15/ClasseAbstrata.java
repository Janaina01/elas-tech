package org.example.aula15;

public abstract class ClasseAbstrata {
    static void main(String[] args) {
        Pagamento pg = new Pagamento();

        pg.numero = 12345;

        pg.meuMetodo(3);

    }

    abstract void meuMetodo();
}
