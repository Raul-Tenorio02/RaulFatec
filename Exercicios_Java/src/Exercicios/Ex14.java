package Exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, notaTrabalho, media;

        System.out.println("\n=====Cálculo de Média=====");
        System.out.print("Insira sua nota da P1: ");
        nota1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Insira sua nota da P2: ");
        nota2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Insira sua nota de trabalho: ");
        notaTrabalho = scanner.nextDouble();
        scanner.nextLine();

        nota1 = nota1*0.35;
        nota2 = nota2*0.35;
        notaTrabalho = notaTrabalho*0.30;

        media = nota1 + nota2 + notaTrabalho;

        if(media < 6){
            System.out.print("Sua média é " + media + " e você vai pegar DP.");
        } else {
            System.out.print("Sua média é " + media + " e você passou na matéria!");
        }
    }
}
