package Exercicios.Ex17;

public class ContaSaldo implements SaldoInterface {

    double saldo, credito, debito;

    public ContaSaldo(double saldo, double credito, double debito) {
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }

    @Override
    public double saldoAtual(double saldo, double credito, double debito){
        return (saldo - debito) + credito;
    }

}
