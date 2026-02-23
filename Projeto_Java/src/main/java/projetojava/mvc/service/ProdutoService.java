package projetojava.mvc.service;

import projetojava.mvc.model.Produto;
import projetojava.mvc.repository.ProdutoRepository;
import java.util.List;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = new ProdutoRepository();
    }

    public void adicionarProduto(Produto produto) throws RuntimeException {
        Produto produtoID = produtoRepository.buscarPorId(produto.getId());

        if(produto.getId() == null || produto.getId() < 0) {
            String mensagem = "Erro: Identificação do produto inválida. Considere inserir uma identificação válida.";
            throw new RuntimeException(mensagem);
        }
        if(produtoID != null) {
            String mensagem = "Erro: Essa identificação já está atrelada a outro produto no sistema. Considere colocar outra identificação no seu produto.";
            throw new RuntimeException(mensagem);
        }
        if(produto.getNome() == null || produto.getNome().isBlank()) {
            String mensagem = "Erro: Nome do produto inválido. Por favor, informe corretamente o nome do produto.";
            throw new RuntimeException(mensagem);
        }
        if(produto.getNome().length() < 4) {
            String mensagem = "Erro: Nome declarado de forma inválida, minímo 4 letras.";
            throw new RuntimeException(mensagem);
        }
        if(produto.getCategoria() == null || produto.getCategoria().isBlank()) {
            String mensagem = "Erro: Categoria do produto inválida. Considere declarar uma categoria válida.";
            throw new RuntimeException(mensagem);
        }
        if(produto.getQuantidade() == null || produto.getQuantidade() < 0) {
            String mensagem = "Erro: Quantidade do produto vazia/inválida. Considere informar um valor válido.";
            throw new RuntimeException(mensagem);
        }

        produtoRepository.inserirProduto(produto);
    }

    public List<Produto> listarProdutos() throws RuntimeException {
        List<Produto> listaProdutos = produtoRepository.buscarProdutos();

        if(listaProdutos.isEmpty()) {
            throw new RuntimeException("Não há produtos cadastrados no sistema.");
        }
//        if(produtoRepository.buscarProdutos().isEmpty()) {
//            throw new RuntimeException("Não há produtos cadastrados no sistema.");
//        }

        return listaProdutos;
    }

    public Produto pesquisarProdutoPorNome(String nome) {
        Produto produtoPesquisado = produtoRepository.buscarProdutoPorNome(nome);

        if(produtoPesquisado == null) {
            String mensagem = "Não há nenhum produto cadastrado com este nome.";
            throw new RuntimeException(mensagem);
        }

//        if(produtoRepository.buscarProdutoPorNome(nome) == null) {
//            String mensagem = "Não há nenhum produto cadastrado com este nome.";
//            throw new RuntimeException(mensagem);
//        }

        return produtoPesquisado;
    }

    public List<Produto> listarProdutosPorCategoria(String categoria) throws RuntimeException {
        List<Produto> listaProdutosPorCategoria = produtoRepository.buscarProdutosPorCategoria(categoria);

        if(listaProdutosPorCategoria.isEmpty()) {
            String mensagem = "Não há produtos cadastrados com essa categoria.";
            throw new RuntimeException(mensagem);
        }

        return listaProdutosPorCategoria;
    }

    public Produto pesquisarProdutoPorId(Integer id) throws RuntimeException {
        Produto produtoPesquisado = produtoRepository.buscarPorId(id);

        if(produtoPesquisado.getId() == null) {
            String mensagem = "Não há produtos cadastrados com essa identificação.";
            throw new RuntimeException(mensagem);
        }

        return produtoPesquisado;
    }

    public void atualizarNome(Integer id, String nome) throws RuntimeException {
        Produto produtoPesquisado = produtoRepository.buscarPorId(id);

        if(id == null) {
            String mensagem = "Nome inválido. Favor informar um nome válido.";
            throw new RuntimeException(mensagem);
        }
        if(nome == null || nome.isBlank()) {
            String mensagem = "Nome inválido. Favor informar um nome válido.";
            throw new RuntimeException(mensagem);
        }
        if(produtoPesquisado == null) {
            String mensagem = "Não há como alterar o nome, produto não encontrado. Favor validar se o produto existe.";
            throw new RuntimeException(mensagem);
        }

        produtoRepository.atualizarNome(id, nome);
    }

    public void aumentarQuantidade(Integer id, Integer qtd) throws RuntimeException {
        Produto produtoPesquisado = produtoRepository.buscarPorId(id);

        if(produtoPesquisado == null) {
            String mensagem = "Não há como alterar a quantidade, produto não encontrado. Favor validar se o produto existe.";
            throw new RuntimeException(mensagem);
        }
        if(qtd <= 0) {
            String mensagem = "Quantidade inválida. Favor informar um valor válido.";
            throw new RuntimeException(mensagem);
        }

        Integer qtdAtual = produtoPesquisado.getQuantidade();
        produtoRepository.atualizarQuantidade(id, (qtdAtual + qtd));
    }

    public void reduzirQuantidade(Integer id, Integer qtd) throws RuntimeException {
        Produto produtoPesquisado = produtoRepository.buscarPorId(id);

        if(produtoPesquisado == null) {
            String mensagem = "Não há como alterar a quantidade, produto não encontrado. Favor validar se o produto existe.";
            throw new RuntimeException(mensagem);
        }
        if(qtd <= 0) {
            String mensagem = "Quantidade inválida. Favor informar um valor válido.";
            throw new RuntimeException(mensagem);
        }
        if(produtoPesquisado.getQuantidade() < qtd) {
            String mensagem = "Quantidade para retirada maior que o estoque disponível. Neste caso, considere remover o produto.";
            throw new RuntimeException(mensagem);
        }

        Integer qtdAtual = produtoPesquisado.getQuantidade();
        produtoRepository.atualizarQuantidade(id, (qtdAtual - qtd));
    }

    public void removerProduto(Integer id) throws RuntimeException {
        Produto produto = produtoRepository.buscarPorId(id);

        if(id == null) {
            String mensagem = "ID inválido. Favor informar um ID válido.";
            throw new RuntimeException(mensagem);
        }
        if(produto == null) {
            String mensagem = "Não há produtos cadastrados com essa identificação. Favor verificar se o produto existe.";
            throw new RuntimeException(mensagem);
        }

        produtoRepository.deletarProduto(id);
    }
}
