package POO_Basic;

public class Carro {
    private boolean statusCar;
    private int marcha;
    private int velocidade;

    public Carro() {
        statusCar = false;
        marcha = 0;
        velocidade = 0;
    }

    private int[] limitesVelocidade(int marcha) {
        switch(marcha) {
            case 0: return new int[]{0,0};
            case 1: return new int[]{0,20};
            case 2: return new int[]{21, 40};
            case 3: return new int[]{41, 60};
            case 4: return new int[]{61, 80};
            case 5: return new int[]{81, 100};
            case 6: return new int[]{101, 120};
            default: return new int[]{0, 0};
        }
    }

    public void ligarCar() {
        if(!statusCar) {
            statusCar = true;
            System.out.println("Voce ligou o carro");
        }else{
            System.out.println("O carro ja esta ligado");
        }
    }

    public void desligarCar() {
        if(statusCar && marcha == 0 && velocidade == 0) {
            statusCar = false;
            System.out.println("Voce desligou o carro");
        }else{
           System.out.println("Não é possível desligar. Coloque no ponto morto e velocidade 0!!!");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        int[] limites = limitesVelocidade(novaMarcha);

        if(statusCar) {
            if (Math.abs(novaMarcha - marcha) == 1) {
                if(velocidade >= limites[0] && velocidade <= limites[1]) {
                    marcha = novaMarcha;
                    System.out.println("Marcha trocada para: " + marcha);
                }else{
                    System.out.println("Velocidade atual não permite trocar para essa marcha.");
                }
            }else {
                System.out.println("Nao pode pular marchas");
            }
        }else {
            System.out.println("O carro deve estar ligado para trocar de marcha");
        }
    }

    public void acelerarCar() {
        int[] limites = limitesVelocidade(marcha);
        if(statusCar) {
            if(marcha != 0) {
                 if(velocidade < limites[1]) {
                     velocidade++;
                     System.out.println("Velocidade atual: " + velocidade + " km/h");
                 }else{
                     System.out.println("A sua velocidade esta fora do limites");
                 }
            }else{
                System.out.println("Voce nao pode acelerar estando com o carro no neutro");
            }
        }else{
            System.out.println("O carro deve estar ligado");
        }
    }

    public void desacelerarCar() {
        if(statusCar) {
            if(velocidade != 0) {
                velocidade--;
                System.out.println("Velocidade atual: " + velocidade + " km/h");
            }else{
                System.out.println("O carro ja esta parado");
            }
        }else{
            System.out.println("O carro deve estar ligado");
        }
    }

    public void virarEsquerda() {
        if(statusCar) {
            if(velocidade >= 1 && velocidade <= 40) {
                System.out.println("O carro esta virando a esquerda");
            }else{
                System.out.println("A sua velocidade esta fora dos limites");
            }
        }else{
            System.out.println("O carro deve estar ligado");
        }
    }

    public void virarDireita() {
        if(statusCar) {
            if(velocidade >= 1 && velocidade <= 40) {
                System.out.println("O carro esta virando a direita");
            }else{
                System.out.println("A sua velocidade esta fora dos limites");
            }
        }else{
            System.out.println("O carro deve estar ligado");
        }
    }
}

