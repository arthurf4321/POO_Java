package POO.Encapsulamento_E_Comportamento;

public class Mercado {
    private int estoque;
    private String produto;
    private String validade;

    //builder
    public Mercado(String produto, String validade, int estoque) {
        this.produto = produto;
        this.validade = validade;
        this.estoque = estoque;
    }

    //Gets
    public String getProduto() { return produto; }
    public String getValidade() { return validade; }
    public int getEstoque() { return estoque; }

    //Methods
    public void verder() {
        if(estoque <= 0) {
            System.out.println("Produto indisponivel!!!");
        }else{
            estoque--;
            System.out.println("Produto vendido");
        }
    }
}
