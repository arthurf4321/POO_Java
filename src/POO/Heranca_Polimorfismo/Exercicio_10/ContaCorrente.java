package POO.Heranca_Polimorfismo.Exercicio_10;

public class ContaCorrente extends ContaBancaria{

    // Construct
    public ContaCorrente(double valor) { super(valor); }

    // Methods
    @Override
    public void Infos() {
        System.out.println("Essa conta tem: " + valor + " R$");
    }
}
