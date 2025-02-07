package Exercicios.Ex20;

public class CarroImposto implements ImpostoInterface{

    int ano;
    double preco;

    public CarroImposto(int ano, double preco) {
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public void calculaImposto(){
        if(ano < 1990){
            double precoAtualizado = preco+=preco*0.01;
            System.out.println("O valor desse carro à venda é de: R$" + precoAtualizado);
        } else {
            double precoAtualizado = preco+=preco*0.015;
            System.out.println("O valor desse carro à venda é de: R$" + precoAtualizado);
        }
    }
}
