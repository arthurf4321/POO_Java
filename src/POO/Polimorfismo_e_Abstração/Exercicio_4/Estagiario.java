package POO.Polimorfismo_e_Abstração.Exercicio_4;

public class Estagiario implements Funcionario10 {
    private String valor;

    // Construct
    public Estagiario(String valor) { this.valor = valor; }

    // Methods
    @Override
    public double calcularBonus(String valor) {
        double salario = Double.parseDouble(this.valor);
        return salario * 0.2;
    }
}
