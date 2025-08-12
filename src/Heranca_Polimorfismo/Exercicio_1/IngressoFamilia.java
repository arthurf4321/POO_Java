package Heranca_Polimorfismo.Exercicio_1;

public class IngressoFamilia extends Ingresso {
    private int pessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int pessoas) {
        super(valor, nomeFilme , dublado);
        this.pessoas = pessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * pessoas;
        if(pessoas > 3) {
            total *= 0.95;
        }
        return total;
    }
}
