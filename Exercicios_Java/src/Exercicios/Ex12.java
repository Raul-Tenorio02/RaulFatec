package Exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int termo;
        int n1 = 0;
        int n2 = 1;
        int nX;

        System.out.println("\n=====Sequência de Fibonacci=====");
        System.out.print("Digite o termo limite: ");
        termo = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < termo; i++) {
            System.out.print(n2 + " ");
            nX = n1 + n2;
            n1 = n2;
            n2 = nX;
        }
        scanner.close();
    }
}
