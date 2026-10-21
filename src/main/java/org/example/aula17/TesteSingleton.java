package org.example.aula17;

public class TesteSingleton {
    private static TesteSingleton instancia;

    private TesteSingleton(){

    }

    public static TesteSingleton getInstancia(){
        if(instancia == null){
            instancia = new TesteSingleton();
        }
        return instancia;
    }


}
