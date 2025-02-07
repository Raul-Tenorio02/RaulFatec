package Exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("\n=====Tabela Plano de Saúde=====");
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Insira sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        if (idade <= 10){
            System.out.println("O custo do plano para " + nome + " será de R$30,00");
        } else if (idade > 10 && idade <= 29){
            System.out.println("O custo do plano para " + nome + " será de R$60,00");
        } else if(idade > 29 && idade <= 45){
            System.out.println("O custo do plano para " + nome + " será de R$120,00");
        } else if(idade > 45 && idade <= 59){
            System.out.println("O custo do plano para " + nome + " será de R$150,00");
        } else if(idade > 59 && idade <= 65){
            System.out.println("O custo do plano para " + nome + " será de R$250,00");
        } else {
            System.out.println("O custo do plano para " + nome + " será de R$400,00");
        }
        scanner.close();
    }
}
