package org.example.aula19.interfaces;

import org.example.aula19.factory.BancoDeDadosFactory;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o banco deseja utilizar? Digite \n1 - MySQL\n2 - MongoDB");
        int opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);
        banco.proibidoBarulhoDepoisDasDez();


        BancoDeDados mySql = new MySql();
        BancoDeDados oracle = new Oracle();


        conectarBanco(mySql);
        conectarBanco(oracle);


    }
    public static void conectarBanco(BancoDeDados bd){
        bd.chamarBanco();

    }
}
