import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();

        while (true) {
            System.out.println("\n=== Controle da Máquina de Banho ===");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Dar banho no pet");
            System.out.println("3. Retirar pet da máquina");
            System.out.println("4. Limpar máquina");
            System.out.println("5. Abastecer água");
            System.out.println("6. Abastecer shampoo");
            System.out.println("7. Verificar nível de água");
            System.out.println("8. Verificar nível de shampoo");
            System.out.println("9. Mostrar status completo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.darBanho();
                    break;
                case 3:
                    maquina.retirarPet();
                    break;
                case 4:
                    maquina.limparMaquina();
                    break;
                case 5:
                    maquina.abastecerAgua();
                    break;
                case 6:
                    maquina.abastecerShampoo();
                    break;
                case 7:
                    maquina.verificarNivelAgua();
                    break;
                case 8:
                    maquina.verificarNivelShampoo();
                    break;
                case 9:
                    maquina.statusMaquina();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
