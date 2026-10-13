package org.example.aula14;

public class Calculadora {
    double calcularArea(double ladoQuadrado){
        return ladoQuadrado * ladoQuadrado;
    }

    double calcularArea(double base, double altura){
        return base * altura;

    }
    double calcularArea(int raioCirculo){
        return  3.14159 * raioCirculo * raioCirculo;
    }
}
