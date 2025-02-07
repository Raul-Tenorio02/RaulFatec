package Exercicios.Ex16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int quantidade;
        double valor;
        double desconto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====Calcula Descontos=====");
        System.out.print("Digite o nome do produto: ");
        nome = scanner.nextLine();
        System.out.print("Digite o valor do produto: R$");
        valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a quantidade de produtos: ");
        quantidade = scanner.nextInt();
        scanner.nextLine();

        if (quantidade > 10 && quantidade <= 20) {
            desconto = 0.10;
        } else if (quantidade > 20 && quantidade <= 50) {
            desconto = 0.20;
        } else if (quantidade > 50) {
            desconto = 0.25;
        } else {
            desconto = 0;
        }

        Cadastro novoProduto = new Cadastro(nome, quantidade, valor, desconto);

        System.out.println("\nProduto: " + novoProduto.nome);
        System.out.println("Preço Unitário: R$" + novoProduto.valor);
        System.out.println("Quantidade: " + novoProduto.quantidade);
        System.out.println("Total a pagar: R$" + novoProduto.calculaTotal(novoProduto.valor, novoProduto.desconto));

        if(quantidade > 10) {
            System.out.println("Desconto de: " + novoProduto.desconto * 100 + "%");
        } else {
            System.out.println("Sem desconto nesta compra.");
        }

        scanner.close();
    }
}    
