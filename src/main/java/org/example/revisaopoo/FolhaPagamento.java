package org.example.revisaopoo;

public class FolhaPagamento {
    private Notificador notificador;  //Folha de pagamento recebe um notificador

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;  //Guarda o notificador
    }
    public void pagar(Funcionario f) {
        double salario = f.calcularSalario();

        notificador.notificar(
                "Pagamento de " + f.getNome() + ": R$ " + salario
        );
    }
}
