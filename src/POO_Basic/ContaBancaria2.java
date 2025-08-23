package POO_Basic;

public class ContaBancaria2 {
    public double valor;

    public void depositar() {
        valor++;
        System.out.println("Valor depositado: " + valor);
    }

    public void sacar() {
        System.out.println("Valor sacado: " + valor);
        valor = 0;
    }

    public void exibirSaldo() {
        System.out.println("O seu saldo e: " + valor);
    }
}
