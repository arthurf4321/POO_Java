package POO.Heranca_Polimorfismo.Exercicio_7;

public class Pessoa {
    private String nome;
    private String cpf;

    // Construct
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Gets and Sets
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    // Methods
    public void infos() {
        System.out.println("ERRO!!!");
    }
}
