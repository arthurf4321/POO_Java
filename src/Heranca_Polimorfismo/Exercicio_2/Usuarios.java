package Heranca_Polimorfismo.Exercicio_2;

public class Usuarios {

    protected String name;
    protected String email;
    protected int senha;
    protected boolean admin;

    public Usuarios(String name, String email, int senha, boolean admin) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }


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

    public void login() {
        System.out.println(name + " logou do sistema");
    }

    public void logoff() {
        System.out.println(name + " saiu do sistema");
    }

    public void alterarDados(String novoName, String novoEmail) {
        this.name = novoName;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!!!");
    }

    public void alterarSenha(int novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!!!");
    }
}
