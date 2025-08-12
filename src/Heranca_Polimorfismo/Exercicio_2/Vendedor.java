package Heranca_Polimorfismo.Exercicio_2;

public class Vendedor extends Usuarios{
    private int qttVendas = 0;

    public Vendedor(String name, String email, int senha) {
        super(name, email, senha, false);
    }

    public void realizarVendas() {
        qttVendas++;
        System.out.println("Voce vendeu: " + qttVendas);
    }

    public void consultarVendar() {
        System.out.println("Quantidade de vendas: " + qttVendas);
    }

}
