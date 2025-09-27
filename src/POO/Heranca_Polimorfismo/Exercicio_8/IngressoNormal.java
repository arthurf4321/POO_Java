package POO.Heranca_Polimorfismo.Exercicio_8;

public class IngressoNormal extends Ingresso{

    // Construct
    public IngressoNormal(int valor) { super(valor); }

    // Methods
    @Override
    public void Infos() {
        System.out.println("Esse ingresso custa " + getValor());
    }
}
