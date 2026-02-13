package projetojava.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class EstoqueModel {

    private List<ProdutoModel> produtos;

    public EstoqueModel() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoModel produtoModel) {
        produtos.add(produtoModel);
    }

    public void atualizarProduto(Integer id, String nome) {

    }


//    public void atualizarNome(String nome) {
//        for(ProdutoModel produtoDaVez: produtos) {
//            if()
//        }
//    }
//
//    public void atualizarCategoria(String categoria) {
//        this.categoria = categoria;
//    }
//
//    public void atualizarQuantidade(Integer quantidade) {
//        this.quantidade += quantidade;
//    }

    public void removerProduto(ProdutoModel produtoModel) {
        produtos.remove(produtoModel);
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "EstoqueModel{" +
                "produtos=" + produtos +
                '}';
    }
}
