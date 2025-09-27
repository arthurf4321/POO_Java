package POO.Heranca_Polimorfismo.Exercicio_7;

public class Professor extends Pessoa{

    // Construct
    public Professor(String nome, String cpf) { super(nome, cpf);}

    // Methods
    @Override
    public void infos() {
        System.out.println("Ola me chamo " + getNome() + " meu cpf e" +  getCpf());
    }
}
