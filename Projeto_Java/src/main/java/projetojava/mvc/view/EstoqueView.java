package projetojava.mvc.view;

import projetojava.mvc.model.EstoqueModel;
import projetojava.mvc.model.ProdutoModel;

import java.util.List;

public class EstoqueView {

    private List<EstoqueModel> estoque;

    public EstoqueView() {
    }

    public EstoqueView(List<EstoqueModel> estoque) {
        this.estoque = estoque;
    }

    public void exibirMenu() {
        System.out.println("Escolha uma das opções para prosseguirmos: \n" +
                "1 - Exibir Estoque \n" +
                "2 - Adicionar Produto");
    }

    public void exibirEstoque() {
        EstoqueModel estoqueModel = new EstoqueModel();

        for (ProdutoModel produtoModel : estoqueModel.getProdutos()) {
            System.out.println("Nome do Produto: " + produtoModel.getNome() + "; Quantidade do Produto: " + produtoModel.getQuantidade());
        }
    }

}
