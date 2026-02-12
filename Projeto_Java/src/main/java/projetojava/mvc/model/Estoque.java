package projetojava.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void exibirMenu() {
        System.out.println("Escolha uma das opções para prosseguirmos: \n" +
                "1 - Exibir Estoque \n" +
                "2 - Adicionar Produto");
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

//    public Produto buscarProdutoPorID(Integer id) {
//        for (Produto produtoDaVez : produtos) {
//            if(produtoDaVez.getId() == id) {
//                return produtoDaVez;
//            }
//        }
//        return null;
//    }
    
    public void exibirEstoque() {
        for (Produto produto : produtos) {
            System.out.println("Nome do Produto: " + produto.getNome() + "; Quantidade do Produto: " + produto.getQuantidade());
        }
    }

}
