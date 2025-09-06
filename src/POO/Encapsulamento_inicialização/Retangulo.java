package POO.Encapsulamento_inicialização;

public class Retangulo {
    private double altura;
    private double largura;

    //construtc
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    //Gets e Sets
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void getLargura(double largura) {
        this.largura = largura;
    }

    public void calcularArea() {
        double area = altura * largura;
        System.out.println("A area do retangulo e: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        System.out.println("A area do retangulo e: " + perimetro);
    }
}
