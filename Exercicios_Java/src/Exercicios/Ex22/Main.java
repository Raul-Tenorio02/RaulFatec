package Exercicios.Ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int base, altura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====Calcula Área Triângulo=====");
        System.out.print("Digite o valor da base: ");
        base = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o valor da altura: ");
        altura = scanner.nextInt();
        scanner.nextLine();

        Triangulo novoTriangulo = new Triangulo(base, altura);
        novoTriangulo.calcularArea();

    }
}
