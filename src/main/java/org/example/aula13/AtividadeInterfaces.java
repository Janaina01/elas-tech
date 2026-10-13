package org.example.aula13;

import java.util.ArrayList;

public class AtividadeInterfaces {
    static void main() {

        System.out.println("\n---QUESTÃO 1---\n");

        /*1. Crie uma interface Animal com o método emitirSom().
            Crie a classe Cachorro que implementa ela e imprime "Au au!".
            Na Main, crie um cachorro e chame o método. Não esqueça do @Override.*/

        Cachorro snoop = new Cachorro();
        snoop.emitirSom();

        /*2. Agora acrescente a classe Gato, que implementa a mesma interface e
        imprime "Miau!". Na main, declare as duas variáveis como Animal:

        Animal bidu = new Cachorro();
        Animal salem= new Gato();

        Chame emitirSom() nas duas.*/

        System.out.println("\n---QUESTÃO 2---\n");

        Animal bidu = new Cachorro();
        Animal salem = new Gato();
        bidu.emitirSom();
        salem.emitirSom();

        /*3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
                e percorra com for-each chamando emitirSom(). Repare que não
        tem nenhum if. Dica:

        animais.add(new Cachorro());*/

        System.out.println("\n---QUESTÃO 3---\n");

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }

        /*4. Crie uma interface Notificacao com o método enviar(String mensagem).
        Crie duas classes que implementam ela: Email e SMS. Cada uma
        imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
        e percorra com for-each, enviando a mesma mensagem.

                Saída esperada:
        E-mail enviado: Sua compra foi aprovada!
                SMS enviado: Sua compra foi aprovada!*/

        System.out.println("\n---QUESTÃO 4---\n");

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar();
        }

        /*5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
        Crie Carro e Moto implementando os dois. Coloque numa lista e
        percorra com for-each chamando os dois métodos em cada um.*/

        System.out.println("\n---QUESTÃO 5---\n");

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }




    }
}
