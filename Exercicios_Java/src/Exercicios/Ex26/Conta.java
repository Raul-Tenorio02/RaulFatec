package Exercicios.Ex26;

public class Conta implements ContaInterface{

    double saldo, taxa;

    public Conta(double saldo, double taxa) {
        this.saldo = saldo;
        this.taxa = taxa;
    }

    @Override
    public void getSaldo(){
        System.out.println("Saldo Atual: " + saldo);
    }

    @Override
    public void atualizaSaldo(double taxa){
        taxa /= 100;
        taxa = saldo*taxa;
        saldo -= taxa;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
        System.out.println("R$" + valor + " depositados!");
    }

    @Override
        public void sacar(double valor){
        saldo -= valor;
        System.out.println("Sacando R$" + valor);
    }

}
