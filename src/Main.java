package Heranca_Polimorfismo.Exercicio_2;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        Gerente gerente = new Gerente("Ana", "ana@email.com", 1234);
        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", 5678);
        Atendente atendente = new Atendente("Maria", "maria@email.com", 9012);

        // Testando Gerente
        gerente.login();
        gerente.gerarRelatorio();
        gerente.consultarVendar();
        gerente.alterarDados("Ana Silva", "ana.silva@email.com");
        gerente.alterarSenha(4321);
        gerente.logoff();

        System.out.println();

        // Testando Vendedor
        vendedor.login();
        vendedor.realizarVendas();
        vendedor.realizarVendas();
        vendedor.consultarVendar();
        vendedor.alterarDados("Carlos Lima", "carlos.lima@email.com");
        vendedor.alterarSenha(8765);
        vendedor.logoff();

        System.out.println();

        // Testando Atendente
        atendente.login();
        atendente.receberPagamento(150.50);
        atendente.receberPagamento(299.99);
        atendente.fecharCaixa();
        atendente.alterarDados("Maria Souza", "maria.souza@email.com");
        atendente.alterarSenha(2109);
        atendente.logoff();
    }
}
