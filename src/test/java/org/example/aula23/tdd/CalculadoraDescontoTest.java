package org.example.aula23.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {
    private CalculadoraDesconto calc;

    @BeforeEach
    void criarObjeto (){calc = new CalculadoraDesconto();}

    @Test
    void deveRetornarValorSemDesconto() {

        //Cria a instância de CalculadoraDesconto


        //Validação com R$50,00
        double resultado = calc.aplicarDesconto(50.0,false);

        //Garantindo o retorno
        assertEquals(50.0,resultado);
    }

    @Test
    void deveAplicarDescontoParaClienteVip() {

        double resultado = calc.aplicarDesconto(200.0,true);

        assertEquals(180.0,resultado);
    }

    @Test
    void deveLancarExcecaoParaValorNegativo() {

        assertThrows(IllegalArgumentException.class, () ->
            calc.aplicarDesconto(-10.0,false)
            );

    }

}