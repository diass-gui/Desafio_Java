package projetojava.mvc.model;

public class ProdutoModel {

    private Integer id;
    private String nome;
    private String categoria;
    private Integer quantidade;

    public ProdutoModel() {
        this.nome = "";
        this.quantidade = 0;
    }

    public ProdutoModel(Integer id, String nome, String categoria, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

//    public void atualizarNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void atualizarCategoria(String categoria) {
//        this.categoria = categoria;
//    }
//
//    public void atualizarQuantidade(Integer quantidade) {
//        this.quantidade += quantidade;
//    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
