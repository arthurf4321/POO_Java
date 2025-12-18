package POO.Polimorfismo_e_Abstração.Exercicio_8;

public class CPF extends Documento {

    private String numeros;

    // Construtor
    public CPF(String numeros) {
        this.numeros = numeros;
    }

    @Override
    public boolean validar() {
        if (numeros == null) {
            System.out.println("CPF inválido");
            return false;
        }

        // Remove tudo que não for número
        String cpf = numeros.replaceAll("\\D", "");

        if (cpf.length() == 11) {
            System.out.println("CPF válido");
            return true;
        } else {
            System.out.println("CPF inválido");
            return false;
        }
    }
}
