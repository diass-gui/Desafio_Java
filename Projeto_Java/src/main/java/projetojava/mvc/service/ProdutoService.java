package projetojava.mvc.service;

import projetojava.mvc.controller.ProdutoController;
import projetojava.mvc.model.Produto;
import projetojava.mvc.repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
    }

    public void adicionarProduto(Produto produto) throws RuntimeException {
        if(produto.getNome() == null || produto.getNome().isBlank() || produto.getNome().isEmpty()) {
            String mensagem = "Erro: Nome do produto inválido. Por favor, informe corretamente o nome do produto.";
            throw new RuntimeException(mensagem);
        }
        if(produtoRepository.buscarProdutoPorNome(produto.getNome()) != null) {
            String mensagem = "Erro: Já existe um produto com o mesmo nome no sistema. Por favor, considere colocar outro nome.";
            throw new RuntimeException(mensagem);
        }
        if(produto.getNome().length() < 4) {
            String mensagem = "Erro: Nome declarado de forma inválida, minímo 3 letras.";
            throw new RuntimeException(mensagem);
        }

//        if(produto.getCategoria()) {}
    }

}
