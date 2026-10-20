package org.example.revisaopoo;

public class AtividadeRevisao {
    public static void main(String[] args) {

        System.out.println("\n---Questão 1: Abstração---\n");
        System.out.println("a) Explique, com suas palavras, o que é abstração em programação orientada a objetos.");
        System.out.println("R: Quando mostramos apenas partes de um objeto, sem mostrar os 'bastidores', ou seja, " +
                "sem mostrar todos os detalhes e como funciona internamente. Isso ajuda a tornar o código mais  " +
                "simplificado e fácil de utilizar.\n");


        System.out.println("b) Qual a diferença entre abstração e encapsulamento?");
        System.out.println("R: A abstração simplifica a utilização de um objeto, mostrando apenas o que é necessário. " +
                "Já o encapsulamento protege os dados e controla como eles podem ser acessados ou modificados.\n");

        System.out.println("c) Quando você usa lista.add('Ana'), você sabe como o Java guarda esse elemento na memória? " +
                "Por que isso é um exemplo de abstração?");
        System.out.println("R: Ao utilizar o método lista.add('Ana'), informamos ao Java o valor que queremos guardar na lista, " +
                "e o Java faz as operações necessárias internamente. Não precisamos saber exatamente como ele faz isso, " +
                "mas conseguimos utilizar o método, isso é abstração.\n");


        System.out.println("---Questão 2: SOLID---\n");

        System.out.println("Para cada código abaixo (comentado no código), diga qual princípio do SOLID está sendo violado e explique como você corrigiria.\n");

        /*a)
        java
        class Relatorio {
            void calcularTotais() { "/* ... *///}
        //    void formatarEmPdf() { /* ... */ }
        //    void salvarNoDisco() { /* ... */ }
        //    void enviarPorEmail() { /* ... */ }
        //}
        System.out.println("a) Princípio violado: S - Responsabilidade Única.\nA classe Relatorio está realizando várias " +
                "ações diferentes. Podemos deixar essas ações separadas em classes por atividade, " +
                "atribuindo as atividades relacionadas a cada escopo.\n");

        /*b)
        java
        class EnviadorEmail {
            void enviar(String tipo) {
                if (tipo.equals("aniversario")) {
                    System.out.println("Feliz aniversário!");
                } else if (tipo.equals("seguranca")) {
                    System.out.println("Alerta de segurança!");
                } else if (tipo.equals("promocao")) {
                    System.out.println("Promoção imperdível!");
                }
            }
        }*/
        System.out.println("b) Princípio violado: O - Aberto/Fechado.\nNa forma em que está, " +
                "toda vez que tiver um novo tipo de e-mail, a classe terá que ser modificada. " +
                "Podemos utilizar interfaces e polimorfismo, implementando a interface para criar novos tipos de e-mail " +
                "sem alterar o código da classe EnviadorEmail constantemente.\n");

        /*c)
        java
        class PedidoService {
            private MySQLRepositorio repo = new MySQLRepositorio();

            void finalizar() {
                repo.salvar();
            }
        }*/
        System.out.println("c) Princípio violado: D - Inversão de Dependência.\nA dependência com a implementação do MySQLRepositorio dificulta a troca de banco de dados, pois teria que modificar diretamente a classe. Para corrigir, podemos utilizar uma interface para implementar diferentes bancos sem alterar a lógica de PedidoService\n") ;

        System.out.println("---Questão 3: Getters e Setters---\n");

        /*Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).

        Crie getters e setters para todos os atributos.
        O setter de preco não deve aceitar valores menores ou iguais a zero.
                O setter de quantidade não deve aceitar valores negativos.
        No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.*/

        Produto produto = new Produto();

        produto.setNome("Caderno");
        produto.setPreco(49.90); //utilizando preço válido
        produto.setQuantidade(3);

        produto.setPreco(-10);  //utilizando preço inválido

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        System.out.println("Quantidade do produto: " + produto.getQuantidade());


        System.out.println("\n---Questão 4: Modificadores de acesso---\n");

        System.out.println("Explique quem pode acessar um atributo ou método declarado com cada modificador:\n");

        System.out.println("a) private:");
        System.out.println("Só pode ser acessado dentro da própria classe em que foi declarado.\n");

        System.out.println("b) default (sem modificador):");
        System.out.println("Pode ser acessado por qualquer classe que esteja no mesmo package.\n");

        System.out.println("c) protected:");
        System.out.println("Pode ser acessado pela própria classe, por classes do mesmo package e " +
                "pelas classes filhas (herança).\n");

        System.out.println("d) public:");
        System.out.println("Pode ser acessado por qualquer classe, inclusive de outros packages.\n");


        System.out.println("---Questão 5: Classe abstrata---\n");

        /*a) Crie uma classe abstrata Forma com:

        um atributo nome;
        um construtor que recebe o nome;
        um método normal exibirNome(), que imprime o nome da forma;
        um método abstrato calcularArea(), que retorna um double.

                b) Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().

                c) No main, crie um Retangulo, chame exibirNome() e imprima a área.

        d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?*/

        Retangulo retangulo = new Retangulo("Retângulo", 5, 3);
        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());

        System.out.println("\nAo tentar escrever Forma f = new Forma(\"teste\"); o código apresenta erro, " +
                "porque as classes abstratas não podem ser instanciadas diretamente, " +
                "elas servem de base pra outras classes herdarem seus atributos e métodos e implementarem seus métodos.\n");


        System.out.println("---Questão 6: Exercício integrado (Sistema de Funcionários)---\n");

        /*Faça em etapas.

                Etapa 1. Crie uma classe abstrata Funcionario com atributos privados nome e salarioBase, um construtor que recebe os dois, getters, e um setter de salarioBase que não aceite valores negativos.

                Etapa 2. Adicione à classe Funcionario um método abstrato calcularSalario().

                Etapa 3. Crie duas classes que herdam de Funcionario:

        Desenvolvedor: o salário é o salário base mais 20%. ( salario = salarioBase + (salarioBase * 0.20) ou

                salario = salarioBase * 1.20

)
        Gerente: o salário é o salário base mais 50%. (

                salario = salarioBase + (salarioBase * 0.50) ou salario = salarioBase * 1.50 )


        Etapa 4. Crie uma interface Notificador com o método notificar(String mensagem). Crie duas implementações: NotificadorEmail e NotificadorSms, cada uma imprimindo a mensagem de um jeito diferente.

        Etapa 5. Crie uma classe FolhaPagamento que recebe um Notificador pelo construtor e tem um método pagar(Funcionario f), que calcula o salário e usa o notificador para avisar o funcionário.

                Etapa 6. No main, crie um desenvolvedor e um gerente, pague os dois usando uma folha com notificação por email, e depois crie outra folha com notificação por SMS.

        Pergunta final: quais princípios e conceitos de POO você usou em cada etapa?*/

        Desenvolvedor dev = new Desenvolvedor("Ana", 5000);
        Gerente gt = new Gerente("Carlos", 8000);

        //Notificação por e-mail
        NotificadorEmail email = new NotificadorEmail();
        FolhaPagamento folhaEmail = new FolhaPagamento(email);

        folhaEmail.pagar(dev);
        folhaEmail.pagar(gt);

        System.out.println("");

        //Notificação por SMS
        NotificadorSms sms = new NotificadorSms();
        FolhaPagamento folhaSms = new FolhaPagamento(sms);

        folhaSms.pagar(dev);
        folhaSms.pagar(gt);

        System.out.println("\nPrincípios e conceitos de POO utilizados:");
        System.out.println("Etapa 1: abstração, encapsulamento, construtor, getters e setter.\n" +
                "Etapa 2: abstração (método abstrato calcularSalario()).\nEtapa 3: herança, sobrescrita e polimorfismo " +
                "(classes Desenvolvedor e Gerente).\nEtapa 4: interface, implementação e polimorfismo.\n" +
                "Etapa 5: polimorfismo e inversão de dependência (SOLID) - FolhaPagamento depende da interface Notificador" +
                ".\nEtapa 6: polimorfismo - diferentes funcionários e diferentes formas de notificação.");
    }
}
