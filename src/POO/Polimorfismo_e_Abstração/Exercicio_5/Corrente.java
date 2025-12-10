package POO.Polimorfismo_e_Abstração.Exercicio_5;

public class Corrente extends Conta {
    private double saldo;

    public Corrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return saldo;
        }
        saldo -= valor;
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }
}
