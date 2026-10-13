package org.example.aula11;

import java.util.HashMap;

public class AulaHashMap {
    static void main() {
        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        HashMap<String, String> emails = new HashMap<String, String>();

        emails.put("Janaina", "jana@gmail.com");
        emails.put("Paloma", "paloma@gmail.com");
        emails.put("posicao 2", "qualquer coisa");
        System.out.println(emails.get("Janaina"));
        System.out.println(emails.get("posicao 2"));
        System.out.println(emails.getOrDefault("olá", "Posição inválida"));

        System.out.println(emails);




    }
}
