package POO.Heranca_Polimorfismo.Exercicio_7;

public class Aluno extends Pessoa{

    // Construct
    public Aluno(String nome, String cpf) { super(nome, cpf); }

    // Methods
    @Override
    public void infos() {
        System.out.println("Meu nome e  " + getNome() + " Meu Cpf e " + getCpf());
    }
}
