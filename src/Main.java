import Heranca_Polimorfismo.MeiaEntrada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor base do ingresso: ");
        double valor = sc.nextDouble();

        sc.nextLine(); // limpar o buffer
        System.out.print("Nome do filme: ");
        String nomeFilme = sc.nextLine();

        System.out.print("É dublado? (true/false): ");
        boolean dublado = sc.nextBoolean();

        System.out.print("Quantas pessoas? ");
        int Pessoas = sc.nextInt();

        MeiaEntrada ingresso = new MeiaEntrada(valor, nomeFilme, dublado);

        System.out.println("Valor real do ingresso: R$ " + ingresso.getValorReal());
    }
}
