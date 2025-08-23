package POO_Basic;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public void exibirInfos() {
        System.out.println("---------------livro " + titulo + "---------------");

        System.out.println("Autor: " + autor);
        System.out.println("ano: " + ano);
        System.out.println("------------------------------------------------");
    }
}
