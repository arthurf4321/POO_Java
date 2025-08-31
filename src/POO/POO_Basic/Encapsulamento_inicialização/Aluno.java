package POO.POO_Basic.Encapsulamento_inicialização;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    //contruct
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public void calcularMedia() {
        double media = (nota1 + nota2) / 2;

        System.out.println("A media do aluno: " + nome + " e " + media);
        if(media >= 5) {
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}
