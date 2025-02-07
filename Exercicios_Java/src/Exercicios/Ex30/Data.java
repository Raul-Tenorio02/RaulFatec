package Exercicios.Ex30;

public class Data implements DataInterface {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int ano, int mes) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void displayData(){
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }

}
