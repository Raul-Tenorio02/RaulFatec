package Exercicios.Ex18;

public class VerificaTriangulo implements TrianguloInterface{

    int x, y, z;

    public VerificaTriangulo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String tipoTriangulo(int x, int y, int z) {
        if(x + y > z || y + z > x || x + z > y){
            if (x == y && x == z){
                return "Esses lados formam um triângulo equilátero!";
            } else if(x == y && x != z || x != y && x == z){
                return "Esses lados formam um triângulo isósceles!";
            } else {
                return "Esses lados formam um triângulo escaleno!";
            }
        } else {
            return "Esses lados não formam um triângulo...";
        }
    }

}
