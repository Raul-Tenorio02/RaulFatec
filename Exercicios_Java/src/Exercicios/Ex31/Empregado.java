package Exercicios.Ex31;

public class Empregado extends Pessoa implements EmpregadoInterface {

    private double salario;

    public Empregado(String nome, String sexo, int idade, double altura, double salario) {
        super(nome, sexo, idade, altura);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String obterLucros(){
        return "Salário de "+ getNome() + ": R$" + salario;
    }
}
