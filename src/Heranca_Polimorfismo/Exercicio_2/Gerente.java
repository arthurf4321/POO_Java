package Heranca_Polimorfismo.Exercicio_2;

public class Gerente extends Usuarios{

    public Gerente(String name, String email, int senha) {
        super(name, email, senha, true);
    }

    public void gerarRelatorio() {
        System.out.println("Relatorio gerado");
    }

    public void consultarVendar() {
        System.out.println("Vendas consultadas");
    }
}
