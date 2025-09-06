package POO.Encapsulamento_E_Comportamento;

import java.util.ArrayList;

public class LojaVirtual {
    private ArrayList<String> clientes;
    private int compras; // contador total de compras

    // Construtor
    public LojaVirtual() {
        this.clientes = new ArrayList<>();
        this.compras = 0;
    }

    // Gets
    public int getCompras() { return compras; }
    public ArrayList<String> getClientes() { return clientes; }

    // Adicionar cliente
    public void adicionarCliente(String cliente) {
        clientes.add(cliente);
        System.out.println("Cliente " + cliente + " adicionado com sucesso!!");
    }

    // Listar clientes
    public void listarClientes() {
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        } else {
            System.out.println("Lista de clientes:");
            for (String c : clientes) {
                System.out.println("- " + c);
            }
        }
    }

    // Registrar compras
    public void registrarCompras() {
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        } else {
            compras++;
            System.out.println("Venda registrada. Total de vendas: " + compras);
        }
    }
}
