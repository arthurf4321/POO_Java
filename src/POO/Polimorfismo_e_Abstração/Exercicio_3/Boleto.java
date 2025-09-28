package POO.Polimorfismo_e_Abstração.Exercicio_3;

public class Boleto implements Pagamento{
    private String valor;

    // Construct
    public Boleto(String valor) { this.valor = valor; }

    // Method
    @Override
    public boolean pagar(String valor) {
        return this.valor.equals(valor);
    }
}
