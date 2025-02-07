package Exercicios.Ex28;

public class Main {
    public static void main(String[] args) {

        Empregado novoEmpregado = new Empregado("João", "Pedro", 2000);
        Empregado novaEmpregada = new Empregado("Maria", "Alice", 3000);

        System.out.println("\n====="+ novoEmpregado.getNome() + " " + novoEmpregado.getSobrenome()+"=====");
        novoEmpregado.setNome("José");
        novoEmpregado.setSobrenome("Henrique");
        System.out.println("Salário Mensal: R$"+novoEmpregado.getSalarioMensal());
        novoEmpregado.salarioAnual();
        novoEmpregado.setSalarioMensal(2500);
        System.out.println("Novo Salário Mensal: R$"+novoEmpregado.getSalarioMensal());
        System.out.println("Nome atualizado: " + novoEmpregado.getNome() + " " + novoEmpregado.getSobrenome());
        novoEmpregado.salarioAnual();

        System.out.println("\n====="+ novaEmpregada.getNome() + " " + novaEmpregada.getSobrenome()+"=====");
        novaEmpregada.setNome("Ana");
        novaEmpregada.setSobrenome("Julia");
        System.out.println("Salário Mensal: R$"+novaEmpregada.getSalarioMensal());
        novaEmpregada.salarioAnual();
        novaEmpregada.setSalarioMensal(3500);
        System.out.println("Novo Salário Mensal: R$"+novaEmpregada.getSalarioMensal());
        System.out.println("Nome atualizado: " + novaEmpregada.getNome() + " " + novaEmpregada.getSobrenome());
        novaEmpregada.salarioAnual();

        System.out.println("\n=====Aumentos de Salário=====");
        novoEmpregado.aumentoSalario();
        System.out.println("Salário Mensal: R$"+novoEmpregado.getSalarioMensal());
        novoEmpregado.salarioAnual();
        novaEmpregada.aumentoSalario();
        System.out.println("Salário Mensal: R$"+novaEmpregada.getSalarioMensal());
        novaEmpregada.salarioAnual();
    }
}
