package POO_Basic;

public class MaquinaBanho {

    // Capacidade máxima de água e shampoo que a máquina suporta
    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    // Quantidade de água e shampoo consumidos por banho
    private final int CONSUMO_AGUA_BANHO = 10;
    private final int CONSUMO_SHAMPOO_BANHO = 2;

    // Quantidade de água e shampoo consumidos para limpeza da máquina
    private final int CONSUMO_AGUA_LIMPEZA = 3;
    private final int CONSUMO_SHAMPOO_LIMPEZA = 1;

    // Quantidade que a máquina é reabastecida por vez
    private final int ABASTECIMENTO_AGUA = 2;
    private final int ABASTECIMENTO_SHAMPOO = 2;

    // Quantidade atual de água e shampoo na máquina
    private int agua;
    private int shampoo;

    // Indica se há um pet dentro da máquina
    private boolean temPet = false;
    // Indica se o pet está limpo após o banho
    private boolean petLimpo = false;
    // Indica se a máquina está suja, precisa de limpeza
    private boolean maquinaSuja = false;

    // Construtor inicia máquina com tanque vazio
    public MaquinaBanho() {
        this.agua = 0;
        this.shampoo = 0;
    }

    // Coloca o pet na máquina, somente se não houver pet e máquina não estiver suja
    public void colocarPet() {
        if(!temPet && !maquinaSuja) {
            temPet = true;
        } else {
            System.out.println("A máquina já está sendo usada ou está suja!!!");
        }
    }

    // Dá banho no pet se tiver pet na máquina e água e shampoo suficientes
    public void darBanho() {
        if(temPet) {
            if(agua >= CONSUMO_AGUA_BANHO && shampoo >= CONSUMO_SHAMPOO_BANHO) {
                agua -= CONSUMO_AGUA_BANHO;
                shampoo -= CONSUMO_SHAMPOO_BANHO;
                petLimpo = true;
                System.out.println("Seu pet está limpo!!!");
            } else {
                System.out.println("A máquina precisa ser reabastecida!!!");
            }
        } else {
            System.out.println("Coloque o pet na máquina!!!");
        }
    }

    // Retira o pet da máquina. Se o pet não estiver limpo, a máquina fica suja e precisa de limpeza
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

    // Limpa a máquina se estiver suja e houver água e shampoo suficiente para limpeza
    public void limparMaquina() {
        if(maquinaSuja) {
            if(agua >= CONSUMO_AGUA_LIMPEZA && shampoo >= CONSUMO_SHAMPOO_LIMPEZA) {
                agua -= CONSUMO_AGUA_LIMPEZA;
                shampoo -= CONSUMO_SHAMPOO_LIMPEZA;
                maquinaSuja = false;
                System.out.println("Limpeza completa");
            } else {
                System.out.println("Você precisa reabastecer a máquina");
            }
        } else {
            System.out.println("Sua máquina já está limpa");
        }
    }

    // Reabastece a água da máquina em quantidade fixa, respeitando o limite máximo
    public void abastecerAgua() {
        int valor = ABASTECIMENTO_AGUA;
        if(agua != MAX_AGUA) {
            if(agua + valor <= MAX_AGUA) {
                agua += valor;
                System.out.println("Você reabasteceu a máquina com Água");
            } else {
                System.out.println("A máquina não suporta essa quantidade de água!!!");
            }
        } else {
            System.out.println("A máquina já está com a capacidade máxima de Água");
        }
    }

    // Reabastece o shampoo da máquina em quantidade fixa, respeitando o limite máximo
    public void abastecerShampoo() {
        int valor = ABASTECIMENTO_SHAMPOO;
        if(shampoo != MAX_SHAMPOO) {
            if(shampoo + valor <= MAX_SHAMPOO) {
                shampoo += valor;
                System.out.println("Você reabasteceu a máquina com Shampoo");
            } else {
                System.out.println("A máquina não suporta essa quantidade de shampoo!!!");
            }
        } else {
            System.out.println("A máquina já está com a capacidade máxima de Shampoo");
        }
    }

    // Exibe o nível atual de água na máquina
    public void verificarNivelAgua() {
        System.out.println("A máquina tem: " + agua + (agua == 1 ? " litro" : " litros") + " de água");
    }

    // Exibe o nível atual de shampoo na máquina
    public void verificarNivelShampoo() {
        System.out.println("A máquina tem: " + shampoo + (shampoo == 1 ? " litro" : " litros") + " de shampoo");
    }

    // Exibe o status completo da máquina: níveis, se há pet, se está limpa ou suja
    public void statusMaquina() {
        System.out.println("\n=== Status da Máquina ===");
        System.out.println("Água: " + agua + "/" + MAX_AGUA + " litros");
        System.out.println("Shampoo: " + shampoo + "/" + MAX_SHAMPOO + " litros");
        System.out.println("Tem pet na máquina: " + (temPet ? "Sim" : "Não"));
        System.out.println("Pet limpo: " + (petLimpo ? "Sim" : "Não"));
        System.out.println("Máquina suja: " + (maquinaSuja ? "Sim" : "Não"));
    }
}
