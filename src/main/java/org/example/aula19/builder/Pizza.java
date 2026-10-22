package org.example.aula19.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Pizza {
    String sabor;
    boolean temQueijo;
    String borda;

   /*private Pizza(Builder builder){
        this.sabor = builder.sabor;
        this.temQueijo = builder.temQueijo;
        this.borda = builder.borda;
    }

    public static  class Builder{
        String sabor;
        boolean temQueijo;
        boolean borda;
    }

    public Builder sabor(String sabor){
        this.sabor = sabor;
        return this;
    }
    public Builder temQueijo(boolean temQueijo){
        this.temQueijo = temQueijo;
        return this;
    }
    public Builder borda(String borda){
        this.borda;
        return this;
    }

    public Pizza build () {
        return  new Pizza(this);
    }*/



}
