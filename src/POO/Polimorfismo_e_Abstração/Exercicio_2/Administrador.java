package POO.Polimorfismo_e_Abstração.Exercicio_2;

public class Administrador implements Autenticavel{

    private String nome;
    private String senha;

    // Construct
    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    // Method
    @Override
    public boolean autenticar(String nome, String senha) {
        return this.nome.equals(nome) && this.senha.equals(senha);
    }
}
