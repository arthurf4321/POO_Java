package POO.Heranca_Polimorfismo.Exercicio_9;

public class Quadrado extends FormaGeometrica{

    // Construct
    public Quadrado(Double valueSides) {
        super(valueSides);
    }

    // Methods
    @Override
    public void Infos() {
        System.out.println("Os lados desse Quadrado tem o valor de: " + valueSides + " Cm2");
    }

    public void Area() {
       double area = valueSides * valueSides;
       System.out.println("A area do quadrado e: " + area);
    }
}
