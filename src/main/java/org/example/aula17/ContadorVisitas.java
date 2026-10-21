package org.example.aula17;

public class ContadorVisitas {
    private static ContadorVisitas instancia;
    private int total = 0;

    public void registrarVisita() {
        total++;
    }

    public int getTotal() {
        return total;
    }

    private ContadorVisitas() {

    }
    public static ContadorVisitas getInstancia() {
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }
}
