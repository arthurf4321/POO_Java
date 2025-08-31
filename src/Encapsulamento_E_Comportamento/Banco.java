package Encapsulamento_E_Comportamento;

public class Banco {
    private String nome;
    private double valor;

    //builder
    public Banco(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    //Gets
    public String getNome() { return nome; }
    public double getValor() { return valor; }

    //Methods
    public void Transferir(Banco destino, double quantia) {
        if(quantia <= 0) {
            System.out.println("Quantia insuficiente!!!");
            return;
        }

        if(this.valor >= quantia) {
            this.valor -= quantia;
            destino.valor += quantia;
            System.out.println("Transferência de R$" + quantia + " realizada com sucesso!");
        }else{
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}
