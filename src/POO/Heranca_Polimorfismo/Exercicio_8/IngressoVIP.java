package POO.Heranca_Polimorfismo.Exercicio_8;

public class IngressoVIP extends Ingresso {

    // Construct
    public IngressoVIP(int valor) { super(valor); }

    //Methods
    @Override
    public void Infos() {
        System.out.println("O valor desse ingresso e " + getValor());
    }
}
