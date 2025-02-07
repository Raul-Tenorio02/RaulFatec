package Exercicios.Ex26;

public class Main {
    public static void main(String[] args) {

        Conta novaConta = new Conta(1000, 1);

        System.out.println("\n===== Banco | Taxa de Administração: 1% =====");
        novaConta.atualizaSaldo(novaConta.taxa);
        novaConta.getSaldo();
        System.out.println("----------------------------------------");
        novaConta.depositar(100);
        novaConta.getSaldo();
        System.out.println("----------------------------------------");
        novaConta.sacar(50);
        novaConta.getSaldo();

    }
}
