package Heranca_Polimorfismo.Exercicio_3;

 class TesteRelogios {
    public static void main(String[] args) {
        RelogioBrasileiro relBras = new RelogioBrasileiro(15, 30, 45);
        RelogioAmericano relAmer = new RelogioAmericano(0, 0, 0);

        System.out.println("Antes da atualização:");
        System.out.println("Brasileiro: " + relBras.formatoRelogio());
        System.out.println("Americano: " + relAmer.formatoRelogio());

        relAmer.atualizarHorarioDeOutroRelogio(relBras);

        System.out.println("\nDepois da atualização:");
        System.out.println("Brasileiro: " + relBras.formatoRelogio());
        System.out.println("Americano: " + relAmer.formatoRelogio());
    }
}
