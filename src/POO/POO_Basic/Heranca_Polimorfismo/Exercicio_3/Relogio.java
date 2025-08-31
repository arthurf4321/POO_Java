package POO.POO_Basic.Heranca_Polimorfismo.Exercicio_3;

public abstract class Relogio {
    // Atributos protegidos que guardam a hora, minuto e segundo
    protected int hora;
    protected int minuto;
    protected int segundos;

    // Construtor para inicializar o relógio com hora, minuto e segundo
    public Relogio(int hora, int minuto, int segundos) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }

    // Getter para obter a hora atual
    public int getHora() {
        return hora;
    }

    // Setter para definir a hora, garantindo que seja entre 0 e 23
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23){
            this.hora = hora;
        } else {
            System.out.println("Erro nas horas");
        }
    }

    // Getter para obter o minuto atual
    public int getMinuto() {
        return minuto;
    }

    // Setter para definir o minuto, garantindo que seja entre 0 e 59
    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Erro nos minutos");
        }
    }

    // Getter para obter os segundos atuais
    public int getSegundos() {
        return segundos;
    }

    // Setter para definir os segundos, garantindo que seja entre 0 e 59
    public void setSegundos(int segundos) {
        if(segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Erro nos segundos");
        }
    }

    // Método que retorna o horário formatado como string no formato HH:MM:SS
    public String formatoRelogio() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundos);
    }

    // Método abstrato que deve ser implementado pelas classes filhas.
    // Vai atualizar o horário deste relógio com base em outro relógio passado como parâmetro.
    public abstract void atualizarHorarioDeOutroRelogio(Relogio outroRelogio);
}
