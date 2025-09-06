package POO.Encapsulamento_inicialização;

public class Telefone {
    private double numero;
    private double numeroAmigo;
    private String operadora;

    //construct
    public Telefone(double numero, double numeroAmigo, String operadora) {
        this.numero = numero;
        this.numeroAmigo = numeroAmigo;
        this.operadora = operadora;
    }

    //Gets e Sets
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumeroAmigo() {
        return numeroAmigo;
    }
    public void setNumeroAmigo(double numeroAmigo) {
        this.numeroAmigo = numeroAmigo;
    }

    public String getOperadora() {
        return operadora;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public void ligar() {
        if(numeroAmigo != 0) {
            System.out.println("LIGANDO");
        }else{
            System.out.println("Salve um numero");
        }
    }
}
