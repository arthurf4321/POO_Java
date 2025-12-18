package POO.Polimorfismo_e_Abstração.Exercicio_7;

public class Aluno implements Imprimivel{
    private String nome2;
    private String cargo2;

    // Construct
    public Aluno(String nome2, String cargo2) { this.nome2 = nome2; this.cargo2 = cargo2;}

    // Methods
    public void imprimirDados(String nome, String cargo) {
        nome = nome2;
        cargo = cargo2;
        System.out.println("nome: " + nome);
        System.out.println("cargo: " + cargo);
    }
}
