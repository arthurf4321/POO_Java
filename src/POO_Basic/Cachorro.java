package POO_Basic;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;


    public void latir() {
        System.out.println( nome + " Au au");
    }

    public void exameRaca() {
        System.out.println("A raca do " + nome + " e " + raca);
    }

    public void exameIdade() {
        System.out.println("A idade do " + nome + " e " + idade);
    }
}
