package Heranca_Polimorfismo.Exercicio_2;

public class Atendente extends Usuarios{
    private double valorEmCaixa;

    public Atendente(String name, String email, int senha) {
        super(name, email, senha, false);
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Valor caixa: " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("O caixa foi zerado e tinha R$: " + valorEmCaixa);
        valorEmCaixa = 0;
    }

    @Override
    public void alterarSenha(int novaSenha) {
        super.alterarSenha(novaSenha);
    }

    @Override
    public void alterarDados(String novoName, String novoEmail) {
        super.alterarDados(novoName, novoEmail);
    }
}
