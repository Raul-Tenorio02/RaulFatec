package Exercicios.Ex24;

import java.util.Scanner;

public class Pessoa implements PessoaInterface {

    int idade, diaNascimento, mesNascimento, anoNascimento;
    String nome;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        if (anoAtual >= anoNascimento){
            idade = anoAtual - (anoNascimento + 1);
            if (mesAtual >= mesNascimento && diaAtual >= diaNascimento || mesAtual > mesNascimento){
                    idade++;
            }
        } else {
            System.out.println("Data inválida. Você não nasceu no futuro.");
        }
    }

    @Override
    public void informaIdade() {
        System.out.println("Idade Atual: " + idade);
    }

    @Override
    public void informaNome() {
        System.out.println("Nome: " + nome);
    }
}
