package POO.Heranca_Polimorfismo.Exercicio_4;

public class Gato extends Animal{

    // Construct
    public Gato(String nome, String som, int idade) {
        super(nome, som, idade);
    }

    // Methods
    @Override
    public void emitirSom() {
        System.out.println(nome + " (Gato) faz: " + som);
    }
}
