package POO.Encapsulamento_inicialização;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    //construct
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void aumentarSalario() {
        if(cargo.equals("caixa")) {
            salario += salario * 0.08;
            System.out.println("O seu salario agora e: " + salario);

        }else if(cargo.equals("auxiliar-administrativa")) {
            salario += salario * 0.15;
            System.out.println("O seu salario agora e: " + salario);

        }else{
            salario += salario * 0.25;
            System.out.println("O seu salario agora e: " + salario);
        }
    }
}
