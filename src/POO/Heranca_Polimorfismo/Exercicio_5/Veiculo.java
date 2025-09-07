package POO.Heranca_Polimorfismo.Exercicio_5;

public class Veiculo {
    private String placa;
    private int ano;

    // Construct
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Gets
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    // Methods
    public void Infos() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
