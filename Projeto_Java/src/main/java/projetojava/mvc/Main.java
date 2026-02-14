package projetojava.mvc;

import projetojava.mvc.model.Estoque;
import projetojava.mvc.view.ProdutoView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoqueModel = new Estoque();
        ProdutoView produtoView = new ProdutoView();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Usuário! Bem vindo ao nosso sistema de estoque e organização de produtos, vamos começar?");

        System.out.println("Primeiro, informe o seu nome:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Olá, " + nomeUsuario + "!");
        produtoView.exibirMenu(); // Exibe o menu para realizar uma ação no estoque
        Integer opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                produtoView.exibirEstoque();
            case 2:
                System.out.println("Vamos adicionar um Produto ao Estoque, informe o nome dele primeiro");
        }

    }

}
