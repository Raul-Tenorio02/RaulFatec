package Exercicios.Ex31;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empregado novoEmpregado = new Empregado(" ", " ", 0, 0.0, 0.0);

        novoEmpregado.setNome(JOptionPane.showInputDialog("Nome: "));
        novoEmpregado.setSexo(JOptionPane.showInputDialog("Sexo: "));
        novoEmpregado.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        novoEmpregado.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));

        String mensagem = "Nome: " + novoEmpregado.getNome() + "\nSexo: " + novoEmpregado.getSexo()
                +"\nIdade: "+ novoEmpregado.getIdade() + "\nAltura: " + novoEmpregado.getAltura();
        JOptionPane.showMessageDialog(null, mensagem);

        novoEmpregado.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Novo Salário: ")));
        JOptionPane.showMessageDialog(null, novoEmpregado.obterLucros());
    }
}
