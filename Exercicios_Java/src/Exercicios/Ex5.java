package Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        double volume, raio, diametro, altura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Volume de uma lata de óleo=====");
        System.out.print("Insira a medida do diametro da lata: ");
        diametro = scanner.nextFloat();
        scanner.nextLine();

        raio = diametro/2;

        System.out.print("Insira a altura da lata: ");
        altura = scanner.nextFloat();
        scanner.nextLine();

        volume = 3.14159*(raio*raio)*altura;
        System.out.println("\nVolume da lata: " + volume + "cm3");

        scanner.close();
    }
}
