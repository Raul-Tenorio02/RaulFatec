package Exercicios;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int intervalo, incremento;
        System.out.println("=====Números Incrementados=====");
        System.out.print("Digite o intervalo desejado: ");
        intervalo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o incremento desejado: ");
        incremento = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < intervalo; i++) {
            i += incremento;
            System.out.print(i + " ");
            i--;
        }
        scanner.close();
    }
}
