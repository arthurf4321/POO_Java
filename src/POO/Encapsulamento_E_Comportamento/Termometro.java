package POO.Encapsulamento_E_Comportamento;

public class Termometro {
    private double tempAtual;

    //construct
    public Termometro(double tempAtual) {
        this.tempAtual = tempAtual;
    }

    //Get
    public double getTempAtual() {
        return tempAtual;
    }

    //methods
    public void aumentarTemp() {
        if(tempAtual >= 37.5) {
            System.out.println("Sua temperatura ja esta alta demais");
        }else{
            tempAtual++;
            System.out.println("Aumentando temperatura!!!");
            System.out.println("Temperatura: " + tempAtual);
        }
    }

    public void diminuirTemp() {
        if(tempAtual <= 35) {
            System.out.println("Sua temperatura ja esta baixa demais");
        }else{
            tempAtual--;
            System.out.println("Diminuindo temperatura!!!");
            System.out.println("Temperatura: " + tempAtual);
        }
    }

    public void converterParaFahrenheit() {
        double fahrenheit = (tempAtual * 9 / 5) + 32;
        System.out.println(tempAtual + " °C = " + fahrenheit + " °F");
    }

    public void converterParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " °F = " + celsius + " °C");
    }
}
