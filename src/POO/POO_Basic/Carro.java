package POO.POO_Basic;

public class Carro {
    // Indica se o carro está ligado (true) ou desligado (false)
    private boolean statusCar;
    // Marcha atual do carro (0 = neutro)
    private int marcha;
    // Velocidade atual do carro em km/h
    private int velocidade;

    // Construtor que inicializa o carro desligado, marcha neutra e velocidade zero
    public Carro() {
        statusCar = false;
        marcha = 0;
        velocidade = 0;
    }

    /**
     * Retorna os limites de velocidade permitidos para cada marcha.
     * @param marcha a marcha para consultar os limites
     * @return array com dois elementos: limite inferior e limite superior de velocidade
     */
    private int[] limitesVelocidade(int marcha) {
        switch(marcha) {
            case 0: return new int[]{0,0};     // Neutro - sem movimento
            case 1: return new int[]{0,20};    // 1ª marcha: 0 a 20 km/h
            case 2: return new int[]{21, 40};  // 2ª marcha: 21 a 40 km/h
            case 3: return new int[]{41, 60};  // 3ª marcha: 41 a 60 km/h
            case 4: return new int[]{61, 80};  // 4ª marcha: 61 a 80 km/h
            case 5: return new int[]{81, 100}; // 5ª marcha: 81 a 100 km/h
            case 6: return new int[]{101, 120}; // 6ª marcha: 101 a 120 km/h
            default: return new int[]{0, 0};   // Marcha inválida
        }
    }

    // Liga o carro, se ainda estiver desligado
    public void ligarCar() {
        if(!statusCar) {
            statusCar = true;
            System.out.println("Você ligou o carro");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    // Desliga o carro somente se estiver parado (velocidade 0) e no neutro (marcha 0)
    public void desligarCar() {
        if(statusCar && marcha == 0 && velocidade == 0) {
            statusCar = false;
            System.out.println("Você desligou o carro");
        } else {
            System.out.println("Não é possível desligar. Coloque no ponto morto e velocidade 0!!!");
        }
    }

    /**
     * Troca para uma nova marcha, se a troca for válida:
     * - O carro precisa estar ligado
     * - A marcha nova deve ser vizinha da atual (não pode pular marchas)
     * - A velocidade atual deve estar dentro dos limites da nova marcha
     * @param novaMarcha marcha para a qual deseja trocar
     */
    public void trocarMarcha(int novaMarcha) {
        int[] limites = limitesVelocidade(novaMarcha);

        if(statusCar) {
            if (Math.abs(novaMarcha - marcha) == 1) { // Só pode trocar para marcha adjacente
                if(velocidade >= limites[0] && velocidade <= limites[1]) {
                    marcha = novaMarcha;
                    System.out.println("Marcha trocada para: " + marcha);
                } else {
                    System.out.println("Velocidade atual não permite trocar para essa marcha.");
                }
            } else {
                System.out.println("Não pode pular marchas");
            }
        } else {
            System.out.println("O carro deve estar ligado para trocar de marcha");
        }
    }

    // Acelera o carro aumentando a velocidade em 1 km/h, respeitando limites da marcha atual
    public void acelerarCar() {
        int[] limites = limitesVelocidade(marcha);
        if(statusCar) {
            if(marcha != 0) { // Só acelera se não estiver no neutro
                if(velocidade < limites[1]) { // Não ultrapassa limite máximo da marcha
                    velocidade++;
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                } else {
                    System.out.println("A sua velocidade está fora dos limites");
                }
            } else {
                System.out.println("Você não pode acelerar estando com o carro no neutro");
            }
        } else {
            System.out.println("O carro deve estar ligado");
        }
    }

    // Desacelera o carro reduzindo a velocidade em 1 km/h até parar
    public void desacelerarCar() {
        if(statusCar) {
            if(velocidade != 0) {
                velocidade--;
                System.out.println("Velocidade atual: " + velocidade + " km/h");
            } else {
                System.out.println("O carro já está parado");
            }
        } else {
            System.out.println("O carro deve estar ligado");
        }
    }

    // Indica que o carro está virando à esquerda, se estiver ligado e velocidade adequada
    public void virarEsquerda() {
        if(statusCar) {
            if(velocidade >= 1 && velocidade <= 40) {
                System.out.println("O carro está virando à esquerda");
            } else {
                System.out.println("A sua velocidade está fora dos limites para virar");
            }
        } else {
            System.out.println("O carro deve estar ligado");
        }
    }

    // Indica que o carro está virando à direita, se estiver ligado e velocidade adequada
    public void virarDireita() {
        if(statusCar) {
            if(velocidade >= 1 && velocidade <= 40) {
                System.out.println("O carro está virando à direita");
            } else {
                System.out.println("A sua velocidade está fora dos limites para virar");
            }
        } else {
            System.out.println("O carro deve estar ligado");
        }
    }
}
