package POO.Encapsulamento_E_Comportamento;

public class Corrida {
    private String player1;
    private String player2;
    private double tempPlayer1;
    private double tempPlayer2;

    //construct
    public Corrida(String player1, String player2,double tempPlayer1 ,double tempPlayer2) {
        this.player1 = player1;
        this.player2 = player2;
        this.tempPlayer1 = tempPlayer1;
        this.tempPlayer2 = tempPlayer2;
    }

    //Gets
    public String getJogador1() { return player1; }
    public String getJogador2() { return player2; }
    public double tempoPlayer1() { return tempPlayer1; }
    public double tempoPlayer2() { return tempPlayer2; }

    //methods
    public void playerWin() {
        if(tempPlayer1 > tempPlayer2) {
            System.out.println(player1 + " E o vencedor");
        }else if(tempPlayer1 < tempPlayer2) {
            System.out.println(player2 + " E o vencedor");
        }else{
            System.out.println("Ouve um empate");
        }
    }
}
