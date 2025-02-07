package Exercicios.Ex27;

public class Faturar implements FaturarInterface {

    int id, quantidade;
    String nome, descricao;
    double precoUnitario;

    public Faturar(int id, int quantidade, String nome, String descricao, double precoUnitario) {
        this.id = id;
        if (quantidade < 0){
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        this.nome = nome;
        this.descricao = descricao;
        if (precoUnitario < 0){
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

    @Override
    public void getNovaFatura(){
        System.out.println("\n=====Info do Produto | ID " + id + "=====");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("\nQuantidade: " + quantidade);
    }

    @Override
    public void getFaturarTotal(){
        double valorTotal = quantidade*precoUnitario;
        System.out.println("Valor total da venda: R$" + valorTotal);
    }

}
