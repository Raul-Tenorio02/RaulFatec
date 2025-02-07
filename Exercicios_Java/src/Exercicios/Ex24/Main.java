package Exercicios.Ex24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int diaAtual, mesAtual, anoAtual;

        Pessoa AlbertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa IsaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("\n=====Idade de físicos se estivessem vivos=====");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====Insira a data presente=====");
        System.out.print("Dia: ");
        diaAtual = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Mês: ");
        mesAtual = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ano: ");
        anoAtual = scanner.nextInt();
        scanner.nextLine();

        AlbertEinstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        IsaacNewton.calculaIdade(diaAtual, mesAtual, anoAtual);

        AlbertEinstein.informaNome();
        AlbertEinstein.informaIdade();

        IsaacNewton.informaNome();
        IsaacNewton.informaIdade();

        scanner.close();

    }
}
