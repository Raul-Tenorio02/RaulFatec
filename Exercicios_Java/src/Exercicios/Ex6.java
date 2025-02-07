package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Verificador de múltiplos de 3=====");
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num%3 == 0){
            System.out.println("\nO número " + num + " é múltiplo de 3");
        } else {
            System.out.println("\nO número " + num + " não é múltiplo de 3");
        }
        scanner.close();
    }
}
