package Exercicios.Ex30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Data novaData = new Data(0, 0, 0);

        System.out.println("======Configurar Data======");
        System.out.print("Dia: ");
        novaData.setDia(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Mês: ");
        novaData.setMes(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Ano: ");
        novaData.setAno(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nData Atualizada!");
        novaData.displayData();



    }
}
