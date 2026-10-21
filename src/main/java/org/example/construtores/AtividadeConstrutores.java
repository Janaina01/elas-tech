package org.example.construtores;

public class AtividadeConstrutores {
    static void main() {
        Agendamento thor = new Agendamento(
                "Thor",
                "banho",
                "14h",
                true,
                true,
                false,
                "alérgico a shampoo",
                10
        );

        thor.mostrar();
        System.out.println("");

        Agendamento luna = new Agendamento(
                "Luna",
                "tosa",
                "10h",
                false,
                false,
                false,
                null,
                0
        );

        luna.mostrar();
        System.out.println("");

        Agendamento mel = new Agendamento(
                "Mel",
                "banho",
                "16h",
                false,
                false,
                true,
                null,
                0
        );

        mel.mostrar();
        System.out.println("");

        System.out.println("\n- Olhando só a linha do new, dá pra saber o que cada true/false significa?");
        System.out.println("R: Não diretamente. O IntelliJ facilita a identificação dos valores por meio das dicas " +
                "dos nomes dos parâmetros. Porém, essas dicas são recursos da IDE e não fazem parte do código. " +
                "Sem elas, precisamos consultar o construtor para saber o significado de cada booleano.\n");


        System.out.println("- Se você trocar a ordem do perfume e do laço sem querer, o código compila? " +
                "Alguém perceberia o erro?");

        System.out.println("R: Sim! Porque os parâmetros são do mesmo tipo (boolean), então o Java não consegue " +
                "identificar que você trocou seus significados.\n");

        System.out.println("- No agendamento b, quantos valores você digitou só pra dizer \"não quero isso\"?");
        System.out.println("R: Foram 5 valores: três false, um null e um 0.");

    }
}
