package Exercicios.Ex29;

public class Calculadora implements CalculadoraInterface{

    char operador;
    double num1, num2, resultado;

    public Calculadora(char operador, double num1, double num2) {
        if(operador == '+' || operador == '-' || operador == '*' || operador == '/') {
            this.operador = operador;
        } else {
            System.out.println("Operador inválido!");
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void realizarOperacao(){
        if (operador == '+'){
            resultado = num1 + num2;
            imprimirResultado();
        } else if (operador == '-') {
            resultado = num1 - num2;
            imprimirResultado();
        } else if (operador == '*') {
            resultado = num1 * num2;
            imprimirResultado();
        } else if (operador == '/'){
            resultado = num1 / num2;
            imprimirResultado();
        } else {

        }
    }

    @Override
    public void imprimirResultado(){
        System.out.println("\nResultado: " + resultado);
    }

}
