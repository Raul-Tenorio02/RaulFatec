package Exercicios.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeProduto;
        double valor;
        double desconto;
        int escolha = 0;
        int index = 0;

        System.out.print("Digite o limite de cadastros: ");
        int limiteCadastro = scanner.nextInt();
        scanner.nextLine();
        ProdutoComDesconto[] produtos = new ProdutoComDesconto[limiteCadastro];

        while (escolha != 3){
            System.out.println("\n=====Menu de Produtos=====");
            System.out.println("1. Cadastrar Produtos");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    if (index == produtos.length){
                        System.out.println("\nLimite de cadastros atingido!");
                    } else {
                        System.out.println("\n=====Cadastro de Desconto=====");
                        System.out.print("Digite o nome do Produto: ");
                        nomeProduto = scanner.nextLine();
                        System.out.print("Digite o valor atual do produto: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite o desconto (%) a ser aplicado nesse produto: ");
                        desconto = scanner.nextDouble();
                        ProdutoComDesconto novoProduto = new ProdutoComDesconto(nomeProduto, valor, desconto);
                        novoProduto.Desconto(nomeProduto, valor, desconto);
                        produtos[index] = novoProduto;
                        index++;
                        break;
                    }
                    break;
                case 2:
                    System.out.println("\n=====Produtos Cadastrados=====");
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] != null)
                            produtos[i].listarProdutos();
                    }
                    break;
                case 3:
                    System.out.println("\n=====Encerrando... Até logo!=====");
                    break;
                default:
                    System.out.println("ERRO: Formato inválido. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
