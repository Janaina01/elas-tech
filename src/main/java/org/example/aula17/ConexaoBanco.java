package org.example.aula17;

public class ConexaoBanco {
    private static ConexaoBanco instancia;

    private ConexaoBanco() {

    }

    public static ConexaoBanco getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoBanco();
        }
        return instancia;
    }
}
