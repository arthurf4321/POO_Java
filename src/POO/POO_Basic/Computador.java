package POO.POO_Basic;

public class Computador {
    public String processador;
    public double ram;
    public boolean statsComputador;


    public void ligar() {
        if(statsComputador) {
            System.out.println("Seu computador ja esta ligado");
        }else{
            statsComputador = true;
            System.out.println("Computador ligado: " + statsComputador);
        }
    }

    public void desligar() {
        if(statsComputador) {
            statsComputador = false;
            System.out.println("Computador desligado: " + !statsComputador);
        }else{
            System.out.println("computador  ja desligado");
        }
    }
}
