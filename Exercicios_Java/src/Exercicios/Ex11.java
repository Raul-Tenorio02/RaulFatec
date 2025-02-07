package Exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inicio, fim;

        System.out.println("\n=====Identifica Números Pares=====");
        System.out.print("Digite o número do início do intervalo: ");
        inicio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o número do fim do intervalo: ");
        fim = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nNúmeros pares encontrados: ");
        for (int i = inicio; i < fim ; i++) {
            if(i%2 == 0){
                System.out.println(i + " ");
            }
        }
        scanner.close();
    }
}
