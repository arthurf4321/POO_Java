package POO.Encapsulamento_E_Comportamento;

public class ControleRemoto {
    private int volume;
    private int canal;

    //construct
    public ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    //Gets
    public int getVolume() { return volume; }
    public int getCanal() { return canal; }

    //methods
    public void aumentarVolume() {
        if(volume < 10) {
            volume++;
            System.out.println("Volume em " + volume);
        }else{
            System.out.println("Volume Ja esta no Maximo!!!");
        }
    }

    public void diminuirVolume() {
        if (volume > 1) {
            volume--;
            System.out.println("Volume em " + volume);
        } else {
            System.out.println("Volume no Minimo");
        }
    }

    public void subirCanal() {
        if(canal < 10) {
            canal++;
            System.out.println("Canal atual " + canal);
        }else{
            System.out.println("Canal no maximo");
        }
    }

    public void descerCanal() {
        if(canal > 1){
            canal--;
            System.out.println("Canal atual " + canal);
        }else{
            System.out.println("Canal no minimo");
        }
    }
}
