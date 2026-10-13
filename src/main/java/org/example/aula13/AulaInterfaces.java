package org.example.aula13;

import java.util.ArrayList;
import java.util.List;

public class AulaInterfaces {
    static void main() {
        Coelho pernalonga = new Coelho();
        pernalonga.fugir();

        Pombo dove = new Pombo();
        dove.fugir();

        Presa coelhinho = new Coelho();
        Presa pombinho = new Pombo();

        ArrayList <String> lista = new ArrayList();
        List<ArrayList> lista2 = new ArrayList<>();

    }
}
