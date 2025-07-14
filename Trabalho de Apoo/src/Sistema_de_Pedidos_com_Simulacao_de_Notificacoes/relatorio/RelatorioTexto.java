package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.relatorio;

import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Servico.Pedido;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Cliente;
import Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Entidades.Produto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RelatorioTexto {
    public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    public static ArrayList<Pedido> listaDePedidos = new ArrayList<>();
    public static ArrayList<Cliente> novoCliente = new ArrayList<>();

    public static void salvarPedido(ArrayList<Pedido> Pedidos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Pedidos.txt"))){
            for(Pedido p : listaDePedidos){
                writer.write(p.toString());
                writer.newLine();
                writer.write("----------------------\n");
            }
            System.out.println("Pedidos salvos em pedidos.txt");
        } catch(IOException e){
            System.out.println("Erro ao salvar pedidos"+ e.getMessage());
        }

        }

    }