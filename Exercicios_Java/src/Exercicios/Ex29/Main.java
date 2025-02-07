package Exercicios.Ex29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==========Calculadora==========");
        System.out.println("============ + - * / ==========");
        System.out.print("\nNúmero: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Operador: ");
        char operador = scanner.next().charAt(0); //converte para char
        scanner.nextLine();
        System.out.print("Número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        Calculadora operacao = new Calculadora(operador, num1, num2);

        operacao.realizarOperacao();
    }
}
