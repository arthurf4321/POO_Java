package POO.Heranca_Polimorfismo.Exercicio_4;

public class Pássaro extends Animal{

    // Construct
    public Pássaro(String nome, String som, int idade) {
        super(nome, som, idade);
    }

    // Methods
    @Override
    public void emitirSom() {
        System.out.println(nome + " (Pássaro) faz: " + som);
    }
}
