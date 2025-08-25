package Encapsulamento_E_Comportamento;

public class Elevador {
    private int andarAtual = 1;
    private int totalAndares;
    private int capacidade;
    private int numPessoas = 0;

    //construct
    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    //Gets e Sets
    public int getAndarAtual() { return andarAtual; }
    public int getTotalAndares() { return totalAndares; }
    public int getCapacidade() { return capacidade; }
    public int getNumPessoas() { return numPessoas; }

    //metodos
    public void entrar() {
        if(numPessoas < capacidade) {
            numPessoas++;
            System.out.println("Voce estrou no elevador");
        }else{
            System.out.println("O elevador esta cheio!!!");
        }
    }

    public void sair() {
        if(numPessoas > 0) {
            numPessoas--;
            System.out.println("Voce saiu do elevador");
        }else{
            System.out.println("O elevador está vazio!");
        }
    }

    public void subir() {
        if(numPessoas > 0){
            if(andarAtual < totalAndares) {
                andarAtual++;
                System.out.println("Você está no andar: " + andarAtual);
            }else{
                System.out.println("Você já está no último andar!");
            }
        }else{
            System.out.println("Você precisa entrar no elevador antes!");
        }
    }

    public void descer() {
        if(numPessoas > 0) {
            if(andarAtual > 1) {
                andarAtual--;
                System.out.println("Você está no andar: " + andarAtual);
            } else {
                System.out.println("Você está no primeiro andar!");
            }
        } else {
            System.out.println("Você precisa entrar no elevador antes!");
        }
    }
}
