package projetojava.mvc.controller;

import projetojava.mvc.model.Produto;
import projetojava.mvc.service.ProdutoService;
import java.util.List;
import java.util.Scanner;

public class ProdutoController {

    private ProdutoService produtoService;
    private Scanner scanner;

    public ProdutoController() {
        this.produtoService = new ProdutoService();
        this.scanner = new Scanner(System.in);
    }

    public void salvarProduto() {
        try {
            System.out.println("Digite o ID do produto:");
            Integer id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Digite a categoria do produto:");
            String categoria = scanner.nextLine();

            System.out.println("Digite a quantidade do produto:");
            Integer quantidade = scanner.nextInt();

            Produto produto = new Produto(id, nome, categoria, quantidade);
            produtoService.adicionarProduto(produto);

            System.out.println("Produto cadastrado com sucesso!");

        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void listarProdutos() {
        try {
            List<Produto> produtos = produtoService.listarProdutos();

            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void pesquisarProdutosPorCategoria() {
        try {
            System.out.println("Digite a categoria que gostaria de pesquisar:");
            String categoria = scanner.nextLine();

            List<Produto> produtos = produtoService.listarProdutosPorCategoria(categoria);

            for (Produto produto : produtos) {
                System.out.println(produto);
            }

        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void pesquisarProdutoPorNome() {
        try {
            System.out.println("Informe o nome do produto:");
            String nome = scanner.nextLine();

            Produto produto = produtoService.pesquisarProdutoPorNome(nome);
            System.out.println(produto);

        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void pesquisarProdutoPorId() {
        try {

            System.out.println("Informe o ID do produto:");
            Integer id = scanner.nextInt();

            Produto produto = produtoService.pesquisarProdutoPorId(id);
            System.out.println(produto);

        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void atualizarNomeProduto() {
        try {

            System.out.println("Informe o ID do produto que você deseja alterar:");
            Integer id = scanner.nextInt();

            System.out.println("Informe o novo nome que você deseja colocar no produto:");
            String nome = scanner.nextLine();

            produtoService.atualizarNome(id, nome);
            System.out.println("Nome atualizado com sucesso!");

        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void atualizarQuantidadeProduto() {
        try {
            System.out.println("Primeiro, informe o ID do produto que você deseja alterar a quantidade:");
            Integer id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe uma das opções: 1 - Aumentar quantidade \n 2 - Reduzir quantidade:");
            Integer opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Digite a quantidade que você deseja adicionar ao produto:");
                Integer quantidade = scanner.nextInt();

                produtoService.aumentarQuantidade(id, quantidade);
                System.out.println("Quantidade atualizada com sucesso!");
            } else if(opcao == 2) {
                System.out.println("Digite a quantidade que você deseja retirar do produto:");
                Integer quantidade = scanner.nextInt();

                produtoService.reduzirQuantidade(id, quantidade);
                System.out.println("Quantidade atualizada com sucesso!");
            } else {
                System.out.println("Opção inválida. Favor informar uma opção válida.");
            }
        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void excluirProduto() {
        try {
            System.out.println("Informe o nome do produto que você deseja excluir:");
            Integer id = scanner.nextInt();
            scanner.nextLine();

            produtoService.removerProduto(id);
            System.out.println("Produto excluído com sucesso!");

        } catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
