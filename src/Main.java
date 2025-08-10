import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(400f);

        conta.consultarSaldo();
        conta.consultarChequeEspecial();

        conta.sacar(450f);
        conta.consultarSaldo();

        conta.depositar(100f);
        conta.consultarSaldo();

        conta.pagarBoleto(30f);
        conta.consultarSaldo();

        System.out.println("Usando cheque especial? " + conta.usandoChequeEspecial());

        scanner.close();
    }
}
