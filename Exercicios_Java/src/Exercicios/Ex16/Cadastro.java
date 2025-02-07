package Exercicios.Ex16;

public class Cadastro implements Operacao {

    String nome;
    int quantidade;
    double valor, desconto;

    public Cadastro(String nome, int quantidade, double valor, double desconto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.desconto = desconto;
    }

    @Override
    public double calculaTotal(double valor, double desconto) {
        desconto = (valor*quantidade)*desconto;
        valor = (valor*quantidade)-desconto;
        return valor;
    }
}
