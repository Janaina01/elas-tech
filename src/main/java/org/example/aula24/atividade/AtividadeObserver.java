package org.example.aula24.atividade;

public class AtividadeObserver {
    static void main() {
        System.out.println("1- Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.");

        System.out.println("R: O Observer resolve o problema de manter vários objetos, mesmo quando há uma mudança" +
                "em outro objeto. Sem que seja necessário atualizar cada um manualmente, ele notifica quando outro objeto" +
                "sofre alteração.\n" +
                "Exemplo do dia a dia: Notificações em um aplicativo de delivery, quando o status do pedido muda, " +
                "o sistema notifica automaticamente o cliente sobre a atualização.\n");

        System.out.println("2 - No Observer, o que é o Subject  e o que é o Observer? " +
                "Como o Subject avisa os observadores sem conhecer as classes concretas deles?");

        System.out.println("R: Subject - é um objeto que pode mudar e é o responsável por notificar os interessados.\n" +
                "Observer - é o objeto que recebe as notificações quando acontece uma mudança.\n" +
                "O Subject avisa os observadores através da Interface, que define o método para atualização.\n");

        System.out.println("3 - Se você precisar adicionar um novo interessado, por exemplo " +
                "um Entregador que também precisa saber quando o pedido muda de status, " +
                "o que é preciso alterar na classe Pedido? Por quê?");

        System.out.println("R: Não seria necessário alterar a classe Pedido, apenas criar a classe Entregador, " +
                "implementando a interface Observer e cadastrando o entregador como observador do pedido." +
                "Isso acontece porque o Sbject trabalha como uma interface, permitindo adicionar novos observadores" +
                "sem modificar a implementação.");

        System.out.println("\n---QUESTÃO 4---\n");

        /*4 - A interface já está pronta:

        public interface ObservadorVoo {
            void atualizar(String status);

        }

        a) Crie uma classe Passageiro que implementa ObservadorVoo e, no atualizar, imprime "Passageiro avisado: " + o status.

        b) Crie uma classe Voo com uma lista de ObservadorVoo, um método adicionarObservador(ObservadorVoo o) e um método mudarStatus(String status), que chama o atualizar de todos da lista.

        c) No main, crie um voo, adicione um passageiro e mude o status para "Embarque iniciado".*/

        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro();

        voo.adicionarObservador(passageiro);

        voo.mudarStatus("Embarque iniciado.");

        System.out.println("\n---QUESTÃO 5---\n");

        /*5 - Crie uma classe PainelAeroporto que também implementa ObservadorVoo e imprime "Painel: " + o status.
        No main, adicione ao voo um passageiro um painel, e mude o status para "Atrasado". Os dois devem ser avisados.
         */

        voo.mudarStatus("Atrasado");



        System.out.println("\n---QUESTÃO 6---\n");

        /*6 - Agora monte o mesmo padrão do zero, com outro tema:

        a) Crie uma interface ObservadorEstoque com o método void atualizar(int quantidade).

        b) Crie uma classe RegistroEstoque que implementa a interface e imprime "Nova quantidade: " + a quantidade.

        c) Crie uma classe Estoque com uma lista de observadores, um método adicionarObservador e um método setQuantidade(int quantidade), que avisa todos da lista.

        d) No main, adicione um RegistroEstoque e mude a quantidade duas vezes.*/

        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(100);
        estoque.setQuantidade(50);



    }
}
