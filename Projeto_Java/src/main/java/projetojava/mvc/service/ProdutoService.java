package projetojava.mvc.service;

import projetojava.mvc.controller.ProdutoController;
import projetojava.mvc.model.Produto;
import projetojava.mvc.repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
    }

    public void adicionarProduto(Produto produto) throws Exception {
        if(produto.getNome() == null || produto.getNome().isBlank() || produto.getNome().isEmpty()) {
            String mensagem = "Nome do produto inválido. Por favor, informe corretamente o nome do produto.";
            throw new Exception(mensagem);
        }
        if(produto.getNome() == produtoRepository.buscarProdutoPorNome()) {}

        if(produto.getCategoria()) {}
    }

}
