package POO.Polimorfismo_e_Abstração.Exercicio_4;

public class Programador implements Funcionario10 {
    private String valor;

    // Construct
    public Programador(String valor) { this.valor = valor; }

    // Methods
    @Override
    public double calcularBonus(String valor) {
        double salario = Double.parseDouble(this.valor);
        return salario * 0.2;
    }
}
