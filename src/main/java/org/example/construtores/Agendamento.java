package org.example.construtores;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento(String nomePet, String servico,
                       String horario, boolean perfume,
                       boolean laco, boolean hidratacao,
                       String observacao, double desconto) {

        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar(){
        System.out.print(nomePet + ", ");
        System.out.print(servico + ", ");
        System.out.print(horario + ", ");

        if(perfume){
            System.out.print("com perfume, ");
        }
        if(laco){
            System.out.print("com laco, ");
        }
        if(hidratacao){
            System.out.print("com hidratação, ");
        }

        if(!perfume && !laco && !hidratacao){
            System.out.print("sem nenhum extra, ");
        }

        if(observacao == null || observacao == " "){
            System.out.print("sem observação" + ", ");
        } else {
            System.out.print(observacao + ", ");
        }
        if(desconto <= 0){
            System.out.print("sem desconto");
        } else {
            System.out.print(desconto + "% de desconto");
        }

    }
}
