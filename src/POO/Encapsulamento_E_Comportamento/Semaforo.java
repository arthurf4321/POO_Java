package POO.Encapsulamento_E_Comportamento;

public class Semaforo {
    private String statsSemaforo;

    //construct
    public Semaforo(String statsSemaforo) {
        this.statsSemaforo = statsSemaforo;
    }

    //Gets
    public String getStatsSemaforo() { return statsSemaforo; }

    //methods
    public void newStats_Verde() {
        if(statsSemaforo.equals("Vermelho")) {
            statsSemaforo = "Verde";
            System.out.println("O Semaforo esta: " + statsSemaforo);
        }else{
            System.out.println("O Semaforo precisa estar Vermelho!!!");
        }
    }

    public void newStats_Amarelo() {
        if(statsSemaforo.equals("Verde")) {
            statsSemaforo = "Amarelo";
            System.out.println("O Semaforo esta: " + statsSemaforo);
        }else{
            System.out.println("O Semaforo precisa estar Verde!!!");
        }
    }

    public void newStats_Vermelho() {
        if(statsSemaforo.equals("Amarelo")) {
            statsSemaforo = "Vermelho";
            System.out.println("O Semaforo esta: " + statsSemaforo);
        }else{
            System.out.println("O Semaforo precisa estar Amarelo!!!");
        }
    }
}
