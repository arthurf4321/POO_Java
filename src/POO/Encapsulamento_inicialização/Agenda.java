package POO.Encapsulamento_inicialização;

public class Agenda {
    private String nome;
    private String numero;

    //construtor
    public Agenda(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
