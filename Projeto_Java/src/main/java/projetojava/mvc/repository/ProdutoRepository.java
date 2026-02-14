package projetojava.mvc.repository;

import projetojava.mvc.configBD.ConnectionBD;
import projetojava.mvc.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public void inserirProduto(Produto produto) {

        String sql = "INSERT INTO Produto VALUES (default, ?, ?, ?); ";

        try(Connection conn = ConnectionBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getCategoria());
            stmt.setInt(4, produto.getQuantidade());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> buscarProdutos() {
        return jdbcTemplate.query("""
                SELECT * FROM Produto;
                """);
    }

//    public Produto buscarProdutoPorNome(String nome) {
//
//        return "";
//
//    }

}
