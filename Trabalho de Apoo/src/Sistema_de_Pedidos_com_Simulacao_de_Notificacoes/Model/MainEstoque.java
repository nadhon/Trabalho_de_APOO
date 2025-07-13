package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Model;

import Servico.Pedido;
import relatorio.RelatorioTexto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static relatorio.RelatorioTexto.listaDePedidos;
import static relatorio.RelatorioTexto.novoCliente;

public class MainEstoque {
    public static void main(String[] arg) throws IOException {
        Scanner scanner = new Scanner(System.in);

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
                case 1:
                        System.out.println("Nome do cliente: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite Seu CPF: ");
                        String CPF = scanner.nextLine();
                        System.out.println("Digite o seu e-mail: ");
                        String email = scanner.nextLine();

                        Cliente cliente = new Cliente(nome,CPF,email);

                        novoCliente.add(cliente);
                        System.out.println("Cliente cadastrado com Sucesso!");
                        break;
                case 2:
                    System.out.println("Cadastrar produto!");

                    System.out.println("Nome: ");
                    String nomedoProduto = scanner.nextLine();

                    System.out.println("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.println("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    Produto produto = new Produto(nomedoProduto,preco,peso);
                    RelatorioTexto.listaDeProdutos.add(produto);
                    System.out.println("Produto cadastrado!");

                    break;
                case 3:
                    System.out.println("Faça seu pedido");
                    if(RelatorioTexto.listaDeProdutos.isEmpty()){
                        System.out.println("Nenhum produto disponivel");
                        break;
                    }
                    Pedido pedido = new Pedido();
                    System.out.println("Escolha o seu pedido(Digitando um número): ");
                    for(int i = 0; i< RelatorioTexto.listaDeProdutos.size(); i++){
                        System.out.println(i+" - "+RelatorioTexto.listaDeProdutos.get(i));
                    }
                    String continuar;
                    do{
                        System.out.println("Produto nº: ");
                        int index = scanner.nextInt();
                        if(index >=0 && index < RelatorioTexto.listaDeProdutos.size()){
                            pedido.adicionarProduto(RelatorioTexto.listaDeProdutos.get(index));
                            System.out.println("produto adicionado ao carrinho!");
                        } else{
                            System.out.println("Índice inválido.");
                        }
                        System.out.println("Adicionar outro? (s/n): ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                    RelatorioTexto.listaDePedidos.add(pedido);
                    System.out.println("Pedido finalizado");
                    break;
                case 4:
                    System.out.println("===PRODUTOS CADASTRADOS===");
                    for (Produto p : RelatorioTexto.listaDeProdutos){
                        System.out.println("- "+p);
                    }
                    break;
                case 5:
                    System.out.println("===PEDIDOS REALIZADOS===");
                    for(Pedido ped: RelatorioTexto.listaDePedidos){
                        System.out.println("- "+ ped);
                    }
                    break;
                case 6:
                    System.out.println("Finalizado o pedido");
                    ArrayList<Produto> todosOsProdutos = new ArrayList<>();
                    for(Pedido ped : RelatorioTexto.listaDePedidos){
                        todosOsProdutos.addAll(ped.getProdutos());
                    }
                    double total = Pedido.totalPedido(todosOsProdutos);
                    System.out.println("Sua fatura: R$"+ total);
                    RelatorioTexto.salvarPedido(listaDePedidos);
                    executado = false;
                    break;
                default:
                    System.out.println("Digite novamente!");
                }

            }
        scanner.close();
        }
}
