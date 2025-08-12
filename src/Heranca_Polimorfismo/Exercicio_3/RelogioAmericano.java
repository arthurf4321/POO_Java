package Heranca_Polimorfismo.Exercicio_3;

public class RelogioAmericano extends Relogio {

    // Construtor que chama o construtor da superclasse para inicializar hora, minuto e segundos
    public RelogioAmericano(int hora, int minuto, int segundos) {
        super(hora, minuto , segundos);
    }

    // Implementação do método abstrato para atualizar o horário deste relógio
    // Recebe outro relógio e ajusta a hora para o formato 12 horas
    @Override
    public void atualizarHorarioDeOutroRelogio(Relogio outrorelogio) {
        int novaHora = outrorelogio.getHora();       // Pega a hora do outro relógio
        int novoMinuto = outrorelogio.getMinuto();   // Pega o minuto do outro relógio
        int novoSegundo = outrorelogio.getSegundos(); // Pega o segundo do outro relógio

        // Ajusta a hora para formato 12h:
        // Se for meia-noite (0), vira 12
        if (novaHora == 0) {
            novaHora = 12;
        }
        // Se for hora maior que 12, subtrai 12 para ajustar ao formato 12h
        else if (novaHora > 12) {
            novaHora = novaHora - 12;
        }

        this.setHora(novaHora);       // Define a hora convertida neste relógio
        this.setMinuto(novoMinuto);   // Define o minuto
        this.setSegundos(novoSegundo); // Define o segundo
    }
}