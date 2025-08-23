package POO_Basic;

public class CarroInfos {
    public String marca;
    public String modelo;
    public int ano;


    public void exibirInfos() {
        System.out.println("Carro");
        System.out.println("-------------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("-------------------------------------");
    }
}
