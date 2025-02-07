package Exercicios.Ex22;

public class Triangulo implements TrianguloInterface{

    int base, altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
   @Override
   public void calcularArea(){
        int area = base*altura/2;
        System.out.println("A área desse triângulo é de: " + area + "cm2");
   }



}
