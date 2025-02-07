package Exercicios.Ex17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo, debito, credito;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Verifica Saldo=====");
        System.out.print("Digite seu saldo atual: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o valor das suas contas a pagar: ");
        debito = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Insira valores a receber: ");
        credito = scanner.nextDouble();
        scanner.nextLine();

        ContaSaldo novaConta = new ContaSaldo(saldo, debito, credito);

        double novoSaldo = novaConta.saldoAtual(saldo, credito, debito);

        System.out.println("\nAqui está o seu saldo atualizado: R$" + novoSaldo);

        if (novoSaldo >= 0){
            System.out.println("Saldo positivo.");
        } else {
            System.out.println("Saldo negativo.");
        }

        scanner.close();

    }
}
