package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos;

    public Pedido(){
        this.produtos = new ArrayList<>();
    }
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }


    public static double totalPedido(ArrayList<Produto>produtos){
        double total = 0;
        for (Produto p : produtos){
            total += p.getPreco();
        }
        return total;
    }
    public static double Frete(ArrayList<Produto> produtos){
        double total = 0;
        for(Produto p :  produtos){
            total += p.getPeso();
        }
        return total * 5.00;
    }
    public double totalComFrete(){
        double total = totalPedido(produtos);
        double frete = Frete(produtos);

        return total+frete;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    @Override
    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append("Pedido:\n");
        for(Produto p : produtos){
            sb.append(" - ").append(p.getNome())
                    .append(" | R$").append(p.getPeso()).append("Kg\n")
                    .append(" | R$").append(p.getPreco());
        }
        sb.append("Total: R$").append(totalComFrete());
        return sb.toString();
    }
}
