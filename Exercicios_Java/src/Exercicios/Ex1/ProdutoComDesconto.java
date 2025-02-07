package Exercicios.Ex1;

public class ProdutoComDesconto extends Produto implements CalculaDesconto{

    double valorComDesconto;
    double desconto;

    public ProdutoComDesconto(String nomeProduto, double valor, double desconto) {
        super(nomeProduto, valor);
        this.valorComDesconto = valorComDesconto;
        this.desconto = desconto;
    }


    @Override
    public void Desconto(String nomeProduto, double valor, double desconto) {
        desconto = desconto/100;
        valor -= valor*desconto;
        valorComDesconto = valor;
        System.out.println("\nNovo Produto Cadastrado!");
    }

    public void listarProdutos(){
        System.out.println("\n=====Listagem de Produtos=====");
        System.out.println("Nome do Produto: " + nomeProduto + "\nValor: " + valor
                + "\nValor com desconto: " + valorComDesconto + "\n======================");
    }
}
