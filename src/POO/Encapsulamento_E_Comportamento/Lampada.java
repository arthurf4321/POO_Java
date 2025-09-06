package POO.Encapsulamento_E_Comportamento;

public class Lampada {
    private boolean stats;

    //construct
    public Lampada(boolean stats) {
        this.stats = stats;
    }

    //Gets
    public boolean getStats() { return stats; }

    //methods
    public void changeStatus() {
        if(stats) {
            stats = false;
            System.out.println("A lampada esta Desligada");
        }else{
            stats = true;
            System.out.println("A lampada esta ligada");
        }
    }
}
