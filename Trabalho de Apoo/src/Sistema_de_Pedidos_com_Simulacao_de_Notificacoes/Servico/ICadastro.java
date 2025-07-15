package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;

import java.util.List;

public interface ICadastro {
    static void cadastrarCliente(String nome, String CPF, String email);
    void cadastrarProduto(String nome, double preco, double peso);
    List<Produto> listarProdutos();
    List<Pedido> listarPedido();
    void adicionarPedido(Pedido pedido);
    double finalizarPedido();

}
