package Exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Digite o intervalo: ");
        int intervalo = scanner.nextInt();
        scanner.nextLine();

        for(int i = 2; i <= intervalo; i++) {
            boolean primo = true;
            for(num = 2; num < i; num++) {
                if(i % num == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
