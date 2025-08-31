package POO.POO_Basic.Encapsulamento_inicialização;

public class Carro {
    private String modelo;
    private double ano;

    //construtor
    public Carro(String modelo, double ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    public Carro() {
    }

    //Gets e Sets
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAno() {
        return ano;
    }
    public void setAno(double ano) {
        this.ano = ano;
    }
}
