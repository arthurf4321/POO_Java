package POO.Polimorfismo_e_Abstração.Exercicio_1;

public class Circulo2 extends Forma{

    private double pi = 3.14;
    private double raio = 5;
    private double circumference;

    // Construct
    public Circulo2(double circumference) { this.circumference = circumference; }

    // Method
    public double calcularArea() {
        double area = pi * (raio * raio);
        System.out.println("A area do circulo e de: " + area);
        return area;
    }
}
