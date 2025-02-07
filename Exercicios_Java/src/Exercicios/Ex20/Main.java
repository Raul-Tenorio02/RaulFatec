package Exercicios.Ex20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ano;
        double preco;


        System.out.println("\n=====Calcula Imposto sobre Carro=====");
        System.out.print("Digite o ano de fabricação do carro: ");
        ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o preço de tabela do carro: ");
        preco = scanner.nextInt();
        scanner.nextLine();

        CarroImposto novoCarro = new CarroImposto(ano, preco);
        novoCarro.calculaImposto();

        scanner.close();


    }
}
