package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        float fahrenheit;
        float celsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Conversor de Celsius em Fahrenheit=====");
        System.out.print("Digite a temperatura em Graus Centígrados: ");
        celsius = scanner.nextFloat();
        scanner.nextLine();

        fahrenheit = (9*celsius+160)/5;
        System.out.println("Temperatura equivalente em Fahrenheit: " + fahrenheit + "ºF");

        scanner.close();
    }
}
