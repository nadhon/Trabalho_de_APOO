package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Persistencia;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Cliente;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DadosDeSistema {
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public List<Pedido> getPedidos(){
        return pedidos;
    }
    public List<Produto> getProdutos(){
        return produtos;
    }
    public List<Cliente> getClientes(){
        return clientes;
    }
}
