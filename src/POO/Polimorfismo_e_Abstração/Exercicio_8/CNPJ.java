package POO.Polimorfismo_e_Abstração.Exercicio_8;

public class CNPJ extends Documento{
    private String numeros;

    // construct
    public CNPJ(String numeros) { this.numeros = numeros; }

    // methods
    @Override
    public boolean validar() {
        if (numeros == null) {
            System.out.println("Cnpj inválido");
            return false;
        }

        // Remove tudo que não for número
        String Cnpj = numeros.replaceAll("\\D", "");

        if (Cnpj.length() == 11) {
            System.out.println("Cnpj válido");
            return true;
        } else {
            System.out.println("Cnpj inválido");
            return false;
        }
    }
}