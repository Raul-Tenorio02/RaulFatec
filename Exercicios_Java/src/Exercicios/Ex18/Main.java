package Exercicios.Ex18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y, z; //medidas a serem verificadas
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Verificador de Triângulos=====");
        System.out.print("Digite a primeira medida: ");
        x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a segunda medida: ");
        y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a terceira medida: ");
        z = scanner.nextInt();
        scanner.nextLine();

        VerificaTriangulo novoTriangulo = new VerificaTriangulo(x, y, z);

        System.out.println(novoTriangulo.tipoTriangulo(x, y, z));

        scanner.close();
    }
}
