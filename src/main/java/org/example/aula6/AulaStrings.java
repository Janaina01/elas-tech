package org.example.aula6;

public class AulaStrings {
    static void main() {
        String nome = "Ana Beatriz";

        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.contains("Beatriz"));
        System.out.println(nome.charAt(0));
        System.out.println(nome.substring(0, 5));
        System.out.println(nome.replace("Beatriz", "Gabriela"));
        System.out.println(" oi ".trim());

        System.out.println(nome.equals("ana beatriz"));
        System.out.println(nome.equalsIgnoreCase("ana beatriz"));

    }
}
