package org.example.aula14;

public class Professora extends Pessoa{
    String disciplina;
    String aluna;
    double nota;

    void lancarNota(){

        System.out.printf(nome + " lançou nota %.1f para %s.%n", nota, aluna);
    }

    @Override
    void apresentar() {
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }
}
