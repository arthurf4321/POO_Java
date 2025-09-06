package POO.Heranca_Polimorfismo.Exercicio_1;

// Classe que representa ingresso para família, com desconto para grupos maiores
public class IngressoFamilia extends Ingresso {
    private int pessoas; // quantidade de pessoas no grupo familiar

    // Construtor que recebe os dados básicos do ingresso e o número de pessoas
    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int pessoas) {
        super(valor, nomeFilme , dublado);
        this.pessoas = pessoas;
    }

    // Calcula o valor total considerando a quantidade de pessoas
    // Aplica desconto de 5% se tiver mais de 3 pessoas
    @Override
    public double getValorReal() {
        double total = valor * pessoas;
        if(pessoas > 3) {
            total *= 0.95; // desconto de 5%
        }
        return total;
    }
}
