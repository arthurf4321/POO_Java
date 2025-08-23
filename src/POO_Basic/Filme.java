package POO_Basic;

public class Filme {
    public String titulo;
    public String descricao;
    public String diretor;
    public String autor;
    public double duracao;

    public void exibirInfos() {
        System.out.println("----------------------" + titulo + "----------------------");
        System.out.println("----------------------" + descricao);
        System.out.println("----------------------" + autor);
        System.out.println("----------------------" + diretor);
        System.out.println("----------------------" + duracao);
        System.out.println("----------------------------------------------------------");
    }
}
