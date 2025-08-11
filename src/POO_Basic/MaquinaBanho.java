package POO_Basic;

public class MaquinaBanho {

    //capacidade maxima
    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    //consumo por operacao
    private final int CONSUMO_AGUA_BANHO = 10;
    private final int CONSUMO_SHAMPOO_BANHO = 2;

    private final int CONSUMO_AGUA_LIMPEZA = 3;
    private final int CONSUMO_SHAMPOO_LIMPEZA = 1;

    //abastecimento por vez
    private final int ABASTECIMENTO_AGUA = 2;
    private final int ABASTECIMENTO_SHAMPOO = 2;

    private int agua;
    private int shampoo;
    private boolean temPet = false;
    private boolean petLimpo = false;
    private boolean maquinaSuja = false;


    public MaquinaBanho() {
        this.agua = 0;
        this.shampoo = 0;
    }

    public void colocarPet() {
        if(!temPet && !maquinaSuja) {
            temPet = true;
        }else{
            System.out.println("A maquina ja esta sendo usada ou esta suja!!!");
        }
    }

    public void darBanho() {
        if(temPet) {
            if(agua >= 10 && shampoo >= 2) {
                agua -= 10;
                shampoo -= 2;
                petLimpo = true;
                System.out.println("Seu pet esta limpo!!!");
            }else{
                System.out.println("A maquina precisa ser reabastecida!!!");
            }
        }else{
            System.out.println("Coloque o pet na maquina!!!");
        }
    }

    public void retirarPet() {
        if (temPet) {
            if (!petLimpo) {
                maquinaSuja = true;
                System.out.println("Pet retirado sujo, a máquina precisa de limpeza!");
            } else {
                System.out.println("Pet retirado limpo, máquina pronta para outro banho.");
            }
            temPet = false;
            petLimpo = false;
        } else {
            System.out.println("Não há pet na máquina para retirar!");
        }
    }


    public void limparMaquina() {
        if(maquinaSuja) {
            if(agua >= CONSUMO_AGUA_LIMPEZA && shampoo >= CONSUMO_SHAMPOO_LIMPEZA) {
                agua -= CONSUMO_AGUA_LIMPEZA;
                shampoo -= CONSUMO_SHAMPOO_LIMPEZA;
                maquinaSuja = false;
                System.out.println("Limpeza completa");
            }else{
                System.out.println("Voce precisa reabastecer a maquina");
            }
        }else{
            System.out.println("Sua maquina ja esta limpa");
        }
    }

    public void abastecerAgua() {
        int valor = ABASTECIMENTO_AGUA;
        if(agua != MAX_AGUA) {
            if(agua + valor <= MAX_AGUA) {
                agua = agua + valor;
                System.out.println("Voce reabasteceu a maquina com Agua");
            }else{
                System.out.println("A maquina nao suporta essa quantidade de agua!!!");
            }
        }else{
            System.out.println("A maquina ja esta com a capacidade maxima de Agua");
        }
    }

    public void abastecerShampoo() {
        int valor = ABASTECIMENTO_SHAMPOO;
        if(shampoo != MAX_SHAMPOO) {
            if(shampoo + valor <= MAX_SHAMPOO) {
                shampoo = shampoo + valor;
                System.out.println("Voce reabasteceu a maquina com Shampoo");
            }else{
                System.out.println("A maquina nao suporta essa quantidade de shampoo!!!");
            }
        }else{
            System.out.println("A maquina ja esta com a capacidade maxima de Shampoo");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("A máquina tem: " + agua + (agua == 1 ? " litro" : " litros") + " de água");
    }

    public void verificarNivelShampoo() {
        System.out.println("A máquina tem: " + shampoo + (shampoo == 1 ? " litro" : " litros") + " de shampoo");
    }

    public void statusMaquina() {
        System.out.println("\n=== Status da Máquina ===");
        System.out.println("Água: " + agua + "/" + MAX_AGUA + " litros");
        System.out.println("Shampoo: " + shampoo + "/" + MAX_SHAMPOO + " litros");
        System.out.println("Tem pet na máquina: " + (temPet ? "Sim" : "Não"));
        System.out.println("Pet limpo: " + (petLimpo ? "Sim" : "Não"));
        System.out.println("Máquina suja: " + (maquinaSuja ? "Sim" : "Não"));
    }
}
