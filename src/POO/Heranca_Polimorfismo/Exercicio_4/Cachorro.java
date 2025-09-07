package POO.Heranca_Polimorfismo.Exercicio_4;

public class Cachorro extends Animal{

    // Construct
    public Cachorro(String nome, String som, int idade) {
        super(nome, som, idade);
    }

    // Methods
    @Override
    public void emitirSom() {
        System.out.println(nome + " (Cachorro) faz: " + som);
    }
}
