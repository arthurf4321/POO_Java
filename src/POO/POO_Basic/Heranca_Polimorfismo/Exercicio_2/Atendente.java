package POO.POO_Basic.Heranca_Polimorfismo.Exercicio_2;

// Classe que representa um Atendente, tipo de usuário que gerencia o caixa
public class Atendente extends Usuarios {
    private double valorEmCaixa; // controla o valor acumulado em caixa

    // Construtor: chama a superclasse e define que Atendente não é administrador
    public Atendente(String name, String email, int senha) {
        super(name, email, senha, false);
    }

    // Método para registrar pagamento recebido, incrementando o valor no caixa
    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Valor caixa: " + valorEmCaixa);
    }

    // Método para fechar o caixa, zerando o valor acumulado e mostrando o total
    public void fecharCaixa() {
        System.out.println("O caixa foi zerado e tinha R$: " + valorEmCaixa);
        valorEmCaixa = 0;
    }

    // Sobrescreve o método para alterar senha usando a implementação da superclasse
    @Override
    public void alterarSenha(int novaSenha) {
        super.alterarSenha(novaSenha);
    }

    // Sobrescreve o método para alterar dados usando a implementação da superclasse
    @Override
    public void alterarDados(String novoName, String novoEmail) {
        super.alterarDados(novoName, novoEmail);
    }
}
