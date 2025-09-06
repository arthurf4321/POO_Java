package POO.Encapsulamento_E_Comportamento;

public class Estoque {
    private int produtos;

    //construct
    public Estoque(int produtos) {
        this.produtos = produtos;
    }

    //Gets
    public int getProdutos() { return produtos; }

    //methods
    public void adicionarProduto() {
        produtos++;
    }
    public void retirarProduto() {
        produtos--;
    }
    public void verificarQuanridade() {
        System.out.println("Temos " + produtos + " Produtos no estoque");
    }
}
