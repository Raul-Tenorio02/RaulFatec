package Exercicios.Ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sexo;
        double altura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Cálculo Peso Ideal=====");
        System.out.println("Digite seu sexo:");
        System.out.println("1. Homem");
        System.out.println("2. Mulher");
        System.out.print("=> ");
        sexo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();
        scanner.nextLine();

        PesoIdeal novoUsuario = new PesoIdeal(altura, sexo);
        novoUsuario.calculaPeso();

        scanner.close();

    }
}
