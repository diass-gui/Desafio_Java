package projetojava.mvc.controller;

import projetojava.mvc.model.Produto;
import projetojava.mvc.service.ProdutoService;
import java.util.List;

public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController() {
        this.produtoService = new ProdutoService();
    }

    public void salvarProduto(Produto produto) {
        try {
            produtoService.adicionarProduto(produto);
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listarProdutos() {
        try {
            List<Produto> produtos = produtoService.listarProdutos();

            return produtos;
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> pesquisarProdutosPorCategoria(String categoria) {
        try {
            List<Produto> produtos = produtoService.listarProdutosPorCategoria(categoria);

            return produtos;
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public Produto pesquisarProdutoPorNome(String nome) {
        try {
            Produto produto = produtoService.pesquisarProdutoPorNome(nome);

            return produto;
        } catch(RuntimeException e) {
              throw new RuntimeException(e);
        }
    }

    public Produto pesquisarProdutoPorId(Integer id) {
        try {
            Produto produto = produtoService.pesquisarProdutoPorId(id);

            return produto;
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarNomeProduto(Integer id, String nome) {
        try {
            produtoService.atualizarNome(id, nome);
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarQuantidadeProduto(Integer opcao, Integer id, Integer quantidade) {
        try {
            if(opcao == 1){
                produtoService.aumentarQuantidade(id, quantidade);
            } else if(opcao == 2) {
                produtoService.reduzirQuantidade(id, quantidade);
            }
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluirProduto(Integer id) {
        try {
            produtoService.removerProduto(id);
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
