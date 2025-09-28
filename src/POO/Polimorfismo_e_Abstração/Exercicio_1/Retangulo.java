package POO.Polimorfismo_e_Abstração.Exercicio_1;

public class Retangulo extends Forma {
    private double base;
    private double altura;
    private double area;

    // Construct
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Method
    @Override
    public double calcularArea() {
        area = base * altura;
        System.out.println("Area e igual a: " + area);
        return area;
    }
}
