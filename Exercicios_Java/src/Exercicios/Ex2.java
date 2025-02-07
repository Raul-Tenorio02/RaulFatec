package Exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int salario;
        int salMinimo;
        int salQTD;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o seu salário atual: ");
        salario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o salário mínimo atual: ");
        salMinimo = scanner.nextInt();
        scanner.nextLine();

        salQTD = salario/salMinimo;
        System.out.println("Sua renda aproximada em quantidade de salários mínimos: " + salQTD);

        scanner.close();
    }
}
