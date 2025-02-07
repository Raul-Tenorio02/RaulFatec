package Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        int n1, n2, n3, temporario; // n = posição
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Lista números em Ordem Crescente=====");
        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o terceiro número: ");
        n3 = scanner.nextInt();
        scanner.nextLine();

        if (n1 < n2){
            if(n2 < n3){
                System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
            } else if (n1 < n3) {
                temporario = n3;
                n3 = n2;
                n2 = temporario;
                System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
            } else {
                temporario = n3;
                n3 = n2;
                n2 = n1;
                n1 = temporario;
                System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
            }
        } else if(n2 < n3){
            if(n1 < n3){
                temporario = n1;
                n1 = n2;
                n2 = temporario;
                System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
            } else {
                temporario = n1; //7
                n1 = n2;
                n2 = n3;
                n3 = temporario;
                System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
            }
        } else { //
            temporario = n1;
            n1 = n3;
            n3 = temporario;
            System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
        }
        scanner.close();
    }
}

