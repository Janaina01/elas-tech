package org.example;

import org.example.aula7.Utilidades;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
           public static void main(String[] args) {
           //Questão 1
            Utilidades.mostrarBoasVindas();

            //Questão 2
            Utilidades.saudar();

           //Questão 3
           System.out.println(Utilidades.dobro(2));

            //Questão 4
             Scanner sc = new Scanner(System.in);
            System.out.println("Insira os valores: ");
            System.out.printf("Média: %.2f", Utilidades.calcularMedia(sc.nextDouble(), sc.nextDouble()));

            //Questão 5
            //Scanner sc = new Scanner(System.in);
               System.out.println("Informe sua idade: ");
               if(Utilidades.ehMaiorDeIdade(sc.nextInt())){
                   System.out.println("É maior de idade.");
               }else {
                   System.out.println("É menor de idade.");
               }

               //Questão 6
               System.out.println(Utilidades.somar(1, 2));
               System.out.println(Utilidades.somar(1, 2, 3));
               System.out.println(Utilidades.somar(2.5, 5.1));

               //Questão 7
               Utilidades.saudacao();

               Utilidades.saudacao("Janaina");





    }
}
