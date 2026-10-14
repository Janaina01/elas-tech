package org.example.aula15;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.equals("")) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Valor recusado!");
            return;
        }
        saldo += valor;
        registrarLog("deposito de " + valor);
    }
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        if(!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        registrarLog("Saque de " + valor);
    }
    private boolean temSaldo(double valor) {
        if(saldo >= valor) {
            return true;
        } else{
            return false;
        }
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] " + titular + ": " + acao);
    }

    private String numeroConta = "001-X";

    public String getNumeroConta() {
        return numeroConta;
    }
}
