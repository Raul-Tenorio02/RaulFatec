package Exercicios.Ex23;

public class Raizes implements RaizInterface{

    double a, b ,c, delta, R1, R2;

    public Raizes(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
        public void calculaRaizes(){
        delta = (b)*(b) -4.0 * (a)*(c);
        R1 = -b+(Math.sqrt(delta));
        R2 = -b-(Math.sqrt(delta));

        if(delta == 0){
            System.out.println("\nAs raízes são iguais:");
            System.out.println("X = " + R1/(2.0*a));
        } else if (delta < 0) {
            System.out.println("\nNão existem raízes reais na equação.");
        } else {
            System.out.println("\nAs raízes da equação são diferentes:");
            System.out.println("X' = " + R1/(2.0*a));
            System.out.println("X'' = " + R2/(2.0*a));
        }

    }
}
