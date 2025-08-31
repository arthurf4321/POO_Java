package POO.POO_Basic.Encapsulamento_inicialização;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    //construtor
    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }


    public void calcularValorTotal() {
        double total = preco * quantidade;
        System.out.println("O total da sua compra e: " + total);
    }
}
