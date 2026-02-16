package projetojava.mvc.view;

import projetojava.mvc.model.Produto;
import java.util.List;

public class ProdutoView {

    public ProdutoView() {
    }

    public void exibirMenu() {
        System.out.println("Escolha uma das opções para prosseguirmos: \n" +
                "1 - Exibir Estoque \n" +
                "2 - Adicionar Produto \n" +
                "3 - Atualizar Produto \n" +
                "4 - Remover Produto");
    }

    public void exibirEstoque(List<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println("Nome do Produto: " + produto.getNome() + "; Quantidade do Produto: " + produto.getQuantidade());
        }
    }

}
