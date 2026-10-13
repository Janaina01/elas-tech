package org.example.aula14;

public class Gerente extends Funcionario implements Notificavel, Exportavel{
    void aprovarFerias(String quem){
        System.out.println("O gerente " + nome + " aprovou as férias de " + quem);
    }
    @Override
    public void notificar(String mensagem){
        System.out.println("Notificação: " + mensagem);
    }
    public void exportar(){
        System.out.println("Dados exportados!");
    }
}
