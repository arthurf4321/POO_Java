package POO.Heranca_Polimorfismo.Exercicio_9;

public class Circulo extends FormaGeometrica{

    private double pi = 3.14;
    private double raio = 5;

    // Construct
    public Circulo(double Circumference) {
        super(Circumference);
    }

    // Methods

    @Override
    public void Infos() {
        System.out.println("O valor da circumferencia do Circulo e: " + Circumference);
    }

    public void area() {
        double area = pi * (raio * raio);
        System.out.println("A area do Circulo e: " + area);
    }
}
