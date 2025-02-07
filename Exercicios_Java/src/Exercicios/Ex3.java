package Exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        float valor1;
        float valor2;
        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Cálculo de Média=====");
        System.out.print("\nDigite o primeiro valor: ");
        valor1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextFloat();
        scanner.nextLine();

        media = (valor1+valor2)/2;
        System.out.println("Média: " + media);

        scanner.close();
    }
}
