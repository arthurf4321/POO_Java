package POO.Heranca_Polimorfismo.Exercicio_9;

import POO.Heranca_Polimorfismo.Exercicio_5.Carro;

public class FormaGeometrica {

    protected double valueSides;
    protected double valueBase;
    protected double Circumference;

    // Constructs
    public FormaGeometrica(double valueSides) {
        this.valueSides = valueSides;
    }
    public FormaGeometrica(double valueSides, double valueBase) {
        this.valueSides = valueSides;
        this.valueBase = valueBase;
    }
    public FormaGeometrica(double Circumference, boolean isCircle) {
        this.Circumference = Circumference;
    }

    // Gets and Sets
    public double getValueSides() { return valueSides; }
    public void setValueSides(double valueSides) { this.valueSides = valueSides; }
    public double getValueBase() { return valueBase; }
    public void setValueBase(double valueBase) { this.valueBase = valueBase; }
    public double getCircumference() { return Circumference; }
    public void setCircumference(double Circumference) { this.Circumference = Circumference; }

    // Methods
    public void Infos() {}
}
