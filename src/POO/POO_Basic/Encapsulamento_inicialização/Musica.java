package POO.POO_Basic.Encapsulamento_inicialização;

public class Musica {
    private String nome;
    private String artista;
    private double duracao;
    private boolean statsTocar;

    //construtc
    public Musica(String nome, String artista, double duracao, boolean statsTocar) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.statsTocar = statsTocar;
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public boolean getStatsTocar() {
        return statsTocar;
    }
    public void setStatsTocar(boolean statsTocar) {
        this.statsTocar = statsTocar;
    }

    public void tocar() {
        if(!statsTocar) {
            statsTocar = true;
            System.out.println("TOcando");
        }else{
            System.out.println("Ja esta tocando");
        }
    }
    public void desligar() {
        if(statsTocar) {
            statsTocar = false;
            System.out.println("desligado");
        }else{
            System.out.println("Ja esta desligado");
        }
    }
}

