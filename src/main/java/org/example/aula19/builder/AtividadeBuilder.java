package org.example.aula19.builder;

public class AtividadeBuilder {
    static void main() {
        AgendamentoRefatorado agendamento1 = AgendamentoRefatorado.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14:00")
                .perfume(true)
                .laco(true)
                .hidratacao(true)
                .observacao("alérgico a shampoo")
                .desconto(10)
                .build();

        AgendamentoRefatorado agendamento2 = AgendamentoRefatorado.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10:00")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .observacao("")
                .desconto(0)
                .build();

        AgendamentoRefatorado agendamento3 = AgendamentoRefatorado.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16:00")
                .perfume(false)
                .laco(false)
                .hidratacao(true)
                .observacao("")
                .desconto(0)
                .build();

        agendamento1.mostrar();
        System.out.println();
        agendamento2.mostrar();
        System.out.println();
        agendamento3.mostrar();
    }
}
