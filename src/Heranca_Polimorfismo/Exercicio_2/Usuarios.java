package Heranca_Polimorfismo.Exercicio_2;

// Classe base que representa um usuário genérico do sistema
public class Usuarios {

    protected String name;      // Nome do usuário
    protected String email;     // Email do usuário
    protected int senha;        // Senha do usuário (em int, mas ideal usar String em apps reais)
    protected boolean admin;    // Indica se o usuário é administrador

    // Construtor para inicializar o usuário com seus dados básicos
    public Usuarios(String name, String email, int senha, boolean admin) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    // Getters e setters para acessar e modificar os atributos
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean isAdmin() {
        return admin;
    }

    // Métodos comuns a todos os usuários
    public void login() {
        System.out.println(name + " logou do sistema");
    }

    public void logoff() {
        System.out.println(name + " saiu do sistema");
    }

    // Permite alterar nome e email do usuário
    public void alterarDados(String novoName, String novoEmail) {
        this.name = novoName;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!!!");
    }

    // Permite alterar a senha do usuário
    public void alterarSenha(int novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!!!");
    }
}
