package Exercicios;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        int tabuada;
        int somaTabuada = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====Cálculo Soma Tabuada=====");
        System.out.print("Digite a tabuada que deseja ver a soma: ");
        tabuada = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= 10; i++) {
            somaTabuada += tabuada*i;
        }
        System.out.println("Essa é a soma da tabuada do " + tabuada + ": " + somaTabuada);

        scanner.close();
    }
}
