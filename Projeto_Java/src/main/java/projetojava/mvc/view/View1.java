package projetojava.mvc.view;

import projetojava.mvc.model.Estoque;
import projetojava.mvc.model.Produto;
import java.util.Scanner;

public class View1 {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        System.out.println("Olá, Usuário! Bem vindo ao nosso sistema de estoque e organização de produtos, vamos começar?");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro, informe o seu nome:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Olá, " + nomeUsuario + "!");
        estoque.exibirMenu();
        Integer opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                estoque.exibirEstoque();
            case 2:
                System.out.println("Vamos adicionar um Produto ao Estoque, informe o nome dele primeiro");
        }
//        Produto produto = new Produto("Smartphone", 15);



//        estoque.adicionarProduto(produto.getNome(), produto.getQuantidade());

    }

}
