package Exercicios.Ex28;

public class Empregado implements EmpregadoInterface{

    private String nome, sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        if (salarioMensal < 0) {
            salarioMensal = 0;
            return salarioMensal;
        } else {
            return salarioMensal;
        }
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void aumentoSalario(){
        double aumento = 0.1;
        salarioMensal += salarioMensal*aumento;
        System.out.println(nome + " " + sobrenome + " obteve um aumento de " + aumento*100 + "%");
    }

    @Override
    public void salarioAnual(){
        double salarioAnual = salarioMensal*12;
        System.out.println("Salário Anual de " + nome + " " + sobrenome +  ": R$"+ salarioAnual);
    }
}
