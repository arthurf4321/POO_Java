package POO.POO_Basic;

public class Celular {
    public String marca;
    public String modelo;
    public boolean statsCelular;


    public void ligar() {
        if (statsCelular) {
            System.out.println("Seu celular ja esta ligado!");
        }else {
            statsCelular = true;
            System.out.println("Celular ligado: " + statsCelular);
        }
    }

    public void desligar() {
        if (statsCelular) {
            statsCelular = false;
            System.out.println("Celular desligado: " + !statsCelular);
        }else{
            System.out.println("Seu celular ja esta desligado");
        }
    }
}
