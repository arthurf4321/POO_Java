package POO.Heranca_Polimorfismo.Exercicio_4;

public class Animal {
    protected String nome;
    protected String som;
    protected int idade;

    //construct
    public Animal(String nome, String som, int idade) {
        this.nome = nome;
        this.som = som;
        this.idade = idade;
    }

    //Gets e Sets
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSom() { return som; }
    public void setSom(String som) { this.som = som; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    //methods
    public void emitirSom() {
        System.out.println(nome + " fez " + som);
    }
}
