package POO.Encapsulamento_inicialização;

public class Pessoa {
    private String cpf;
    private int idade;

    //construtc
    public Pessoa(String cpf, int idade) {
        this.cpf = cpf;
        this.idade = idade;
    }

    //Gets e Sets
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calcularMaioridade() {
        if(idade >= 18) {
            System.out.println("Voce e maior de idade");
        }else{
            System.out.println("voce e menor de idade");
        }
    }
}
