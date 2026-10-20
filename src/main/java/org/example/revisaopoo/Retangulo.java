package org.example.revisaopoo;

public class Retangulo extends Forma{
    double largura;
    double altura;

    public Retangulo(String nome, double largura, double altura){
        super(nome); //passe nome para o construtor da classe mãe (Forma)
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura*altura;
    }
}
