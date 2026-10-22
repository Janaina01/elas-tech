package org.example.aula19.factory;

import org.example.aula19.interfaces.BancoDeDados;
import org.example.aula19.interfaces.MongoDb;
import org.example.aula19.interfaces.MySql;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao){
        if(opcao == 1){
            return new MySql();
        } else if (opcao == 2){
            return new MongoDb();
        } else {
            throw new IllegalArgumentException("Opção inválida.");
        }
    }

}
