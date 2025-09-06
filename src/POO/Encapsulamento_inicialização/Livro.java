package POO.Encapsulamento_inicialização;

public class Livro {
    private String titulo;
    private String autor;
    private double paginas;

    //Construtor
    public Livro(String titulo, String autor, double paginas) {
        this.autor = autor;
        this.paginas = paginas;
        this.titulo = titulo;
    }

    //Gets e Sets
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPaginas() {
        return paginas;
    }
    public void setPaginas(double paginas) {
        this.paginas = paginas;
    }
}
