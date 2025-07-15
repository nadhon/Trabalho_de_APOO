package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Cliente;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Persistencia.DadosDeSistema;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.relatorio.RelatorioTexto;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeCadastro implements ICadastro{

    private static final DadosDeSistema dados = DadosDeSistema.getInstance();

    public static void cadastrarCliente(String nome, String CPF, String email) {
        dados.getClientes().add(new Cliente(nome,CPF,email));
    }

    @Override
    public void cadastrarProduto(String nome, double preco, double peso) {
        dados.getProdutos().add(new Produto(nome,preco,peso));
    }

    @Override
    public List<Produto> listarProdutos() {
        return dados.getProdutos();
    }

    @Override
    public List<Pedido> listarPedido() {
        return dados.getListapedidos();
    }

    @Override
    public void adicionarPedido(Pedido pedido) {
        dados.getListapedidos().add(new Pedido());
    }

    @Override
    public double finalizarPedido() {
        List<Pedido> pedidos = dados.getListapedidos();
        ArrayList<Produto> todosOsProdutos =  new ArrayList<>();
        for (Pedido p : pedidos ) {
            todosOsProdutos.addAll(p.getProdutos());
        }
        double total = Pedido.totalPedido(todosOsProdutos);
        RelatorioTexto.salvarPedido(new ArrayList<>(pedidos));
        return total;
    }
}
