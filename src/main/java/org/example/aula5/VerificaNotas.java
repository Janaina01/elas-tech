package org.example.aula5;

import java.util.Scanner;

public class VerificaNotas {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Aluna aluna1 = new Aluna();
        aluna1.continuar = true;

        while (aluna1.continuar) {

            System.out.println("Deseja continuar? \n1 - Continuar \n2 - Sair ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a primeira nota: ");
                    aluna1.nota =  sc.nextDouble();

                    System.out.println("Digite a segunda nota: ");
                    aluna1.nota2 = sc.nextDouble();

                    aluna1.media = (aluna1.nota + aluna1.nota2) / 2;
                    sc.nextLine();

                    System.out.println("Digite seu nome: ");
                    aluna1.nome = sc.nextLine();

                    if(aluna1.media >= 6){
                        aluna1.passou = true;
                    } else {
                        aluna1.passou = false;
                    }

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, "
                            + "sua segunda nota foi %.1f, e sua média final foi %.1f. "
                            + "Aluna aprovada: %b%n", aluna1.nome, aluna1.nota, aluna1.nota2, aluna1.media,
                            aluna1.passou);
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    aluna1.continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }


    }
}
