package POO.Polimorfismo_e_Abstração.Exercicio_3;

public class CartaoCredito implements Pagamento{
    private String valor;

    // Construct
    public CartaoCredito(String valor) {
        this.valor = valor;
    }

    // Method

    @Override
    public boolean pagar(String valor) {
        return this.valor.equals(valor);
    }
}
