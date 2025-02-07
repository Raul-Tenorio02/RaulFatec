package Exercicios.Ex23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====Cálculo de Raízes=====");
        System.out.print("Digite o primeiro valor: ");
        a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o segundo valor: ");
        b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o terceiro valor: ");
        c = scanner.nextDouble();
        scanner.nextLine();

        Raizes novaRaiz = new Raizes(a, b, c);
        novaRaiz.calculaRaizes();

        scanner.close();
    }
}
