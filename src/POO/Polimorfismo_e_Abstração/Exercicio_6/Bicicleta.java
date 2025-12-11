package POO.Polimorfismo_e_Abstração.Exercicio_6;

public class Bicicleta implements MeioDeTransporte{
    private double velocidade;
    private double valorAcelerador;
    private double valorFreio;

    // construct
    public Bicicleta(double valorAcelerador, double valorFreio, double velocidade){ this.valorAcelerador = valorAcelerador; this.valorFreio = valorFreio; this.velocidade = velocidade; }

    // Methods
    public double acelerar(double valorAcelerador) {
        velocidade =+ valorAcelerador;
        System.out.println("Km" + velocidade);
        return velocidade;
    }

    public double freiar(double valorFreio) {
        if(valorFreio > velocidade) {
            System.out.println("voce esta freiadno demais");
        } else {
            velocidade =- valorFreio;
            System.out.println("Km" + velocidade);
            return velocidade;
        }
        return velocidade;
    }
}