package POO.Heranca_Polimorfismo.Exercicio_10;

public class ContaPoupanca extends ContaBancaria{

    // Construct
    public ContaPoupanca(double valor) { super(valor); }

    // Methods
    @Override
    public void Infos() {
        System.out.println("Essa conta tem: " + valor + " R$");
    }

    public void rendimento() {
        double rendAno = 0.085;
        double rende = valor * rendAno;
        valor += rende;
        System.out.println("Seu dinheiro em 1 Ano sera de: " + valor + " R$");
    }
}
