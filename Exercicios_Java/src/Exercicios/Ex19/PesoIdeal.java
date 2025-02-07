package Exercicios.Ex19;

public class PesoIdeal implements PesoInterface{

    /* fórmulas pré definidas pelo exercício:
    H = (72,7 x altura) - 58
    M = (62,1 x altura) - 44,7
     */

    double altura, pesoIdeal;
    int sexo;

    public PesoIdeal(double altura, int sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    @Override
    public void calculaPeso(){
        if(sexo == 1){
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("\nVocê é homem, então seu peso ideal é: " + pesoIdeal);
        } else if (sexo == 2){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("\nVocê é mulher, então seu peso ideal é: " + pesoIdeal);
        } else {
            System.out.println("\nErro. Entrada Inválida.");
        }
    }
}
