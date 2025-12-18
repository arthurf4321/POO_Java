package POO.Polimorfismo_e_Abstração.Exercicio_7;

public class Professor implements Imprimivel{
    private String nome2;
    private String cargo2;

    // Construct
    public Professor(String nome2, String cargo2) { this.nome2 = nome2; this.cargo2 = cargo2;}

    // Methods
    public void imprimirDados(String nome, String cargo) {
        cargo = cargo2;
        nome = nome2;
        System.out.println("Nome: " + nome);
        System.out.println("Cargo" + cargo);
    }
}
