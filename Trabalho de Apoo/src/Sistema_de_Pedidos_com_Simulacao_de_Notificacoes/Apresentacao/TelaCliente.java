package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Apresentacao;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico.Pedido;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico.SistemaDeCadastro;

import java.util.List;
import java.util.Scanner;

public class TelaCliente {
    private final Scanner scanner;
    private final SistemaDeCadastro sistema = new SistemaDeCadastro();

    public TelaCliente() {
        scanner = new Scanner(System.in);
    }

    public void exibir(){
        boolean executado = true;
        while (executado){

        System.out.println("====Menu====");
        System.out.println("1.cadastrar cliente");
        System.out.println("2.cadastrar produto");
        System.out.println("3. fazer pedido");
        System.out.println("4. resumo dos pediodos");
        System.out.println("5. visualizar pedidos realizados");
        System.out.println("6. finalizar pedido");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1 ->  cadastrarCliente();
            case 2 ->  cadastrarProduto();
            case 3 ->  fazerPedido();
            case 4 ->  listarPedidos();
            case 5 ->  listarProdutos();
            case 6 -> {
                finalizarPedidos();
                executado = false;
            }
            default -> System.out.println("Digite novamente!");
        }

    }
        scanner.close();
}
private void cadastrarCliente(){
        System.out.println("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu CPF: ");
        String CPF = scanner.nextLine();
        System.out.println("Digite o seu e-mail: ");
        String email = scanner.nextLine();

        SistemaDeCadastro.cadastrarCliente(nome,CPF,email);
        System.out.println("Cliente cadastrado com Sucesso!");

}
private void cadastrarProduto(){
    System.out.println("Nome do Produto: ");
    String nome = scanner.nextLine();
    System.out.println("Digite o Preço do Produto: ");
    String preco = scanner.nextLine();
    System.out.println("Digite o Peso do Produto: ");
    String peso = scanner.nextLine();

    SistemaDeCadastro.cadastrarCliente(nome,preco,peso);
    System.out.println("Produto cadastrado com Sucesso!");
}
private void fazerPedido() {
    List<Produto> produtos = sistema.listarProdutos();
    if (produtos.isEmpty()) {
        System.out.println("Nenhum Produto disponível.");
    }
    Pedido pedido = new Pedido();
    System.out.println("Escolha os seus Produtos digitando o número correspondente: ");
    for (int i = 0; i < produtos.size(); i++) {
        System.out.println(i + " -- " + produtos.get(i));
    }
    String continuar;
    do {
        System.out.println("Produto nº: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < produtos.size()) {
            pedido.adicionarProduto(produtos.get(index));
        } else {
            System.out.println("Indice Invalido.");
        }
        System.out.println("Adicionar outro item? (s/n): ");
        continuar = scanner.nextLine();
    } while (continuar.equalsIgnoreCase("s"));
    sistema.adicionarPedido(pedido);
    System.out.println("Pedido adicionado no carrinho");
}
private void listarProdutos(){
        List<Produto> produtos = sistema.listarProdutos();
        System.out.println("==== PRODUTOS CADASTRADOS ====");
        for (Produto p : produtos) {
            System.out.println(" - "+p);
        }
}
private void listarPedidos(){
        List<Pedido> pedidos = sistema.listarPedido();
        System.out.println("==== PEDIDOS DO CARRINHO");
        for (Pedido p : pedidos) {
            System.out.println(" - "+p);
        }
}
private void finalizarPedidos(){
        double total = sistema.finalizarPedido();
        System.out.printf("Sua fatura : R$ %.2f%n",total);
        System.out.println("Pedidos Finalizados e Nota emitida com Sucesso.");
}
}
