package POO.Polimorfismo_e_Abstração.Exercicio_7;

public class Funcionario implements Imprimivel{
    private String nome2;
    private String cargo2;

    // Construct
    public Funcionario(String nome2, String cargo2) { this.nome2 = nome2; this.cargo2 = cargo2; }

    // Methods
    public void imprimirDados(String nome, String cargo) {
        nome = nome2;
        cargo = cargo2;
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
    }
}
