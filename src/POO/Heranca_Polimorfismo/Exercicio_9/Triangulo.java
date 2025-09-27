package POO.Heranca_Polimorfismo.Exercicio_9;

public class Triangulo extends FormaGeometrica{

    // Construct
    public Triangulo(double valueSides, double valueBase) {
        super(valueSides,valueBase);
    }

    // Methods
    @Override
    public void Infos() {
        System.out.println("O valor dos lados e base do Triangulo sao: " + valueSides  +  valueBase);
    }

    public void Area() {
        double area = valueBase * valueSides / (2);
        System.out.println("A area do Triangulo e: " + area);
    }
}
