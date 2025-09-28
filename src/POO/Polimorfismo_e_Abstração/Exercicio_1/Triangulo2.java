package POO.Polimorfismo_e_Abstração.Exercicio_1;

public class Triangulo2 extends Forma{

    private double base;
    private double altura;

    // Construct
    public Triangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // method
    public double calcularArea() {
        double area = base * altura / (2);
        System.out.println("A area do triangulo e: " + area);
        return area;
    }
}
