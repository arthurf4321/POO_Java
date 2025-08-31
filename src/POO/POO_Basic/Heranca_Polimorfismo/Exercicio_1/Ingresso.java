package POO.POO_Basic.Heranca_Polimorfismo.Exercicio_1;

// Classe abstrata que representa um ingresso de cinema
public abstract class Ingresso {

    // Valor base do ingresso
    protected double valor;
    // Nome do filme relacionado ao ingresso
    protected String nomeFilme;
    // Indica se o filme é dublado (true) ou legendado (false)
    protected boolean dublado;

    // Construtor para inicializar os dados do ingresso
    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    // Método abstrato que será implementado pelas subclasses para retornar o valor real do ingresso
    public abstract double getValorReal();
}
