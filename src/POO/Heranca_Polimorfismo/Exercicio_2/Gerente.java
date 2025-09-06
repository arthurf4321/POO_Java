package POO.Heranca_Polimorfismo.Exercicio_2;

// Classe que representa o Gerente, usuário com privilégios administrativos
public class Gerente extends Usuarios {

    // Construtor: define o gerente como administrador sempre (admin = true)
    public Gerente(String name, String email, int senha) {
        super(name, email, senha, true);
    }

    // Método para gerar relatório financeiro — simulado aqui com print
    public void gerarRelatorio() {
        System.out.println("Relatorio gerado");
    }

    // Método para consultar vendas — simulado aqui com print
    public void consultarVendar() {
        System.out.println("Vendas consultadas");
    }
}
