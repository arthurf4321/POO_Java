package Heranca_Polimorfismo.Exercicio_3;

public class RelogioBrasileiro extends Relogio {

    // Construtor que recebe hora, minuto e segundo e passa para o construtor da superclasse
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    // Este método não é necessário porque a superclasse já tem os getters,
    // mas ele retorna a hora do relógio atual (pode ser removido para evitar confusão)
    public int gethoraOutroRelogio() {
        return hora;
    }

    // Implementa o método abstrato para atualizar o horário
    // Copia a hora, minuto e segundo do relógio passado como parâmetro para este objeto
    @Override
    public void atualizarHorarioDeOutroRelogio(Relogio outrorelogio) {
        int novaHora = outrorelogio.getHora();       // Pega a hora do outro relógio
        int novoMinuto = outrorelogio.getMinuto();   // Pega o minuto do outro relógio
        int novoSegundo = outrorelogio.getSegundos(); // Pega o segundo do outro relógio

        this.setHora(novaHora);       // Atualiza a hora deste relógio
        this.setMinuto(novoMinuto);   // Atualiza o minuto deste relógio
        this.setSegundos(novoSegundo); // Atualiza o segundo deste relógio
    }
}
