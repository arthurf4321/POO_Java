package POO.POO_Basic.Heranca_Polimorfismo.Exercicio_1;

// Classe que representa ingresso meia-entrada, com preço reduzido pela metade
public class MeiaEntrada extends Ingresso {

    // Construtor que repassa os dados básicos para a superclasse
    public MeiaEntrada(double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }

    // Retorna o valor do ingresso pela metade
    @Override
    public double getValorReal() {
        return valor / 2;
    }
}
