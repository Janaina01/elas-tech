package org.example.aula3;

import java.util.Scanner;

public class EstruturasDecisao {
    static void main() {

        //Questão 1 - validação de idades
        int idade = 28;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade <=17) {
            System.out.println("Adolescente");
        } else if (idade <=59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

    //Questão 2
        double saldoConta = 500.00;
        double valorConta = 320.00;

        if (saldoConta >= valorConta){
            System.out.println("Compra Aprovada! Seu saldo restante é: R$ " + (saldoConta - valorConta));
        } else {
            System.out.println("Saldo insuficiente! Faltam R$ " + (valorConta - saldoConta)
                    + " para completar a transação.");
        }

    //Questão 3 - usando switch
        int opcao = 9;
        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate Quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
                default:
                    System.out.println("Opção Inválida");
        }
        //Questão 4
        int idadeEntrar = 17;
        boolean temAutorizacao = true;
            if  (idadeEntrar >= 18 || temAutorizacao == true){
            System.out.println("Pode entrar na festa!");
         } else {
            System.out.println("Você não está autorizado a entrar na festa.");
        }

        int idadeEntrar2 = 18;
        boolean temAutorizacao2 = true;
        if  (idadeEntrar >= 18 && temAutorizacao2 == true){
            System.out.println("Pode entrar na festa!");
        } else {
            System.out.println("Você não está autorizado a entrar na festa.");
        }

        //Desafio
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovada! \nSua média é: %.2f", media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Recuperação! \nSua média é: %.2f", media);
        } else {
            System.out.printf("Reprovada! \nSua média é: %.2f", media);
        }

    }
}
