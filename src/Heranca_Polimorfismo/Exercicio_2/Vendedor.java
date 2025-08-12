package Heranca_Polimorfismo.Exercicio_2;

// Classe que representa o vendedor, com controle da quantidade de vendas
public class Vendedor extends Usuarios {
    private int qttVendas = 0; // contador das vendas realizadas

    // Construtor: vendedor não é administrador (admin = false)
    public Vendedor(String name, String email, int senha) {
        super(name, email, senha, false);
    }

    // Método que registra uma venda e incrementa o contador
    public void realizarVendas() {
        qttVendas++;
        System.out.println("Voce vendeu: " + qttVendas);
    }

    // Método para consultar a quantidade total de vendas realizadas
    public void consultarVendar() {
        System.out.println("Quantidade de vendas: " + qttVendas);
    }
}
