package projetojava.mvc.model;

public class Produto {

    private String nome;
    private String categoria;
    private Integer quantidade;

    public Produto() {
        this.nome = "";
        this.categoria = "";
        this.quantidade = 0;
    }

    public Produto(String nome, String categoria, Integer quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
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
