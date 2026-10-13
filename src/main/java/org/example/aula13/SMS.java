package org.example.aula13;

public class SMS implements Notificacao{
    @Override
    public void enviar() {
        System.out.println("SMS enviado: Sua compra foi aprovada!");
    }
}
