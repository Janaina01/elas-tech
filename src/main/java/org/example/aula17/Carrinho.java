package org.example.aula17;

public class Carrinho {
    private static Carrinho instancia;
    private  int quantidadeItens = 0;

    public void adicionatItem(){
        quantidadeItens++;
    }
   public  int getQuantidadeItens() {
        return quantidadeItens;
   }

   private Carrinho(){

   }
   public static Carrinho getInstancia(){
        if(instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
   }
}
