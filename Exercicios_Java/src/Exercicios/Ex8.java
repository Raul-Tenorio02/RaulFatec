package Exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorProduto;

        System.out.println("\n=====Lucro por Venda=====");
        System.out.print("Digite o valor do produto: ");
        valorProduto = scanner.nextFloat();
        scanner.nextLine();

        if (valorProduto < 20){
            valorProduto += valorProduto*0.45;
            System.out.println("Valor para obter lucro de 45%: R$" + valorProduto );
        } else {
            valorProduto += valorProduto*0.30;
            System.out.println("Valor para obter lucro de 30%: R$" + valorProduto);
        }
        scanner.close();
    }
}
