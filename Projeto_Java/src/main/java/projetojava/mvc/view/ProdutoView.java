package projetojava.mvc.view;

import projetojava.mvc.controller.ProdutoController;
import projetojava.mvc.model.Produto;
import java.util.List;
import java.util.Scanner;

public class ProdutoView {

    private ProdutoController produtoController;
    private Scanner scanner;

    public ProdutoView() {
        this.produtoController = new ProdutoController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {

        Integer opcao = 0;

        while (opcao != 6) {

            System.out.println("Escolha uma das opções para prosseguirmos: \n" +
                    "1 - Exibir Produtos \n" +
                    "2 - Pesquisar Produtos \n" +
                    "3 - Adicionar Produto \n" +
                    "4 - Atualizar Produto \n" +
                    "5 - Remover Produto \n" +
                    "6 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                produtoController.listarProdutos();
            } else if (opcao == 2) {
                System.out.println("Escolha uma das opções para pesquisarmos: 1 - Pesquisar por Nome \n 2 - Pesquisar por Categoria \n 3 - Pesquisar por ID:");
                Integer opcaoPesquisada = scanner.nextInt();
                scanner.nextLine();

                if (opcaoPesquisada == 1) {
                    produtoController.pesquisarProdutoPorNome();
                } else if (opcaoPesquisada == 2) {
                    produtoController.pesquisarProdutosPorCategoria();
                } else if (opcaoPesquisada == 3) {
                    produtoController.pesquisarProdutoPorId();
                } else {
                    System.out.println("Opção Inválida. Favor informar uma opção válida.");
                }
            } else if (opcao == 3) {
                produtoController.salvarProduto();
            } else if (opcao == 4) {
                System.out.println("Escolha uma das opções para a gente prosseguir: 1 - Atualizar Nome do Produto \n 2 - Atualizar Quantidade do Produto:");
                Integer opcaoPesquisada = scanner.nextInt();
                scanner.nextLine();

                if (opcaoPesquisada == 1) {
                    produtoController.atualizarNomeProduto();
                } else if (opcaoPesquisada == 2) {
                    produtoController.atualizarQuantidadeProduto();
                } else {
                    System.out.println("Opção Inválida. Favor informar uma opção válida.");
                }
            } else if (opcao == 5) {
                produtoController.excluirProduto();
            } else if (opcao == 6) {
                System.out.println("Encerrando a aplicação...");
            } else {
                System.out.println("Opção inválida. Favor informar uma opção válida.");
            }
        }
    }
//    public void exibirEstoque(List<Produto> produtos) {
//        for (Produto produto : produtos) {
//            System.out.println("Nome do Produto: " + produto.getNome() + "; Quantidade do Produto: " + produto.getQuantidade());
//        }
//    }

}
