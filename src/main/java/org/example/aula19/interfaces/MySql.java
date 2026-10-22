package org.example.aula19.interfaces;

public class MySql implements BancoDeDados {

   private int numero;
   private String nome;

   public void chamarBanco() {
        System.out.println("O banco conectado é o MySQL.");
   }
    public void proibidoBarulhoDepoisDasDez() {

    }


    public int getNumero(){
        return numero;
    }
    public String getNome(){
       return nome;
    }

}
