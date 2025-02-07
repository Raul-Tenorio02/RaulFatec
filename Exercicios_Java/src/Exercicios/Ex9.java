package Exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("\n=====Classe eleitoral por idade=====");
        System.out.print("Informe sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 16 && idade < 18 || idade > 65){
            System.out.println("O seu voto é facultativo.");
        } else if ( idade >= 18 && idade <= 65){
            System.out.println("Você deve votar obrigatoriamente.");
        } else {
            System.out.println("Você ainda não pode votar.");
        }
        scanner.close();
    }
}
