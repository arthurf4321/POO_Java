package POO.Heranca_Polimorfismo.Exercicio_6;

public class Funcionario {
    private String nome;
    private int salario;

    // Construct
    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Gets e Sets
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getSalario() { return salario; }
    public void setSalario(int salario) { this.salario = salario; }

    // Methods
    public void Apresentar() {
        System.out.println("Ola meu nome e " + nome + " e ganho " + salario);
    }
}
