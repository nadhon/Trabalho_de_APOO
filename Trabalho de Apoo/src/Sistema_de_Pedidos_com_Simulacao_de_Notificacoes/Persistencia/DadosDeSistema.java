package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Persistencia;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Cliente;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DadosDeSistema {
    private static DadosDeSistema instancia;

    protected DadosDeSistema(){}
    public static DadosDeSistema getInstance()
    {
        if(instancia == null){
            instancia =  new DadosDeSistema();
        }
        return instancia;
    }
    private List<Pedido> Listapedidos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public List<Pedido> getListapedidos(){

        return Listapedidos;
    }
    public List<Produto> getProdutos(){
        return produtos;
    }
    public List<Cliente> getClientes(){
        return clientes;
    }
}
