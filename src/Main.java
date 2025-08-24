package POO_Basic;

import Encapsulamento_inicialização.*;
import Encapsulamento_inicialização.Carro;
import Encapsulamento_inicialização.Pessoa;

import java.util.Map;
import java.util.HashMap;

import javax.swing.*;

class Testes {
    public static void main(String[] args) {

    /*
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "jopa";
        pessoa1.idade = 12;
        pessoa1.falar();


        CarroInfos carro1 = new CarroInfos();
        carro1.modelo = "Civic";
        carro1.ano = 2007;
        carro1.marca = "Honda";
        carro1.exibirInfos();


        Cachorro cachorro1 = new Cachorro();
        cachorro1.raca = "PitBul";
        cachorro1.nome = "Trevoso";
        cachorro1.idade = 12;

        cachorro1.latir();
        cachorro1.exameIdade();
        cachorro1.exameRaca();


        Livro livro1 = new Livro();
        livro1.autor = "Arthur";
        livro1.titulo = "O mundo por tras da sociedade";
        livro1.ano = 1930;
        livro1.exibirInfos();


        Celular celular1 = new Celular();
        celular1.marca = "Android";
        celular1.modelo = "A15";
        celular1.statsCelular = false;

        celular1.ligar();
        celular1.desligar();


        Canetta caneta1 = new Canetta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5;
        caneta1.escrever();


        Computador computador1 = new Computador();
        computador1.processador = "Ryzen 5600GT";
        computador1.ram = 16.0;
        computador1.statsComputador = false;
        computador1.ligar();
        computador1.desligar();


        Filme filme1 = new Filme();
        filme1.titulo = "Planeta do macacos";
        filme1.descricao = "Muitas sociedades de macacos cresceram desde quando César levou seu povo a um oásis, enquanto os humanos foram reduzidos a sobreviver e se esconder nas sombras. Um líder macaco começa a escravizar outros grupos para encontrar tecnologia humana, enquanto um jovem macaco, que viu seu clã ser capturado, embarca em uma viagem para encontrar a liberdade, sendo uma jovem humana a chave para todos.";
        filme1.duracao = 2.30;
        filme1.autor = "Pierre Boille";
        filme1.diretor = "Franklin J. Schaffner, Don Taylor, Ted Post, J. Lee Thompson";
        filme1.exibirInfos();


        ContaBancaria2 conta1 = new ContaBancaria2();
        conta1.valor = 100;
        conta1.depositar();
        conta1.sacar();
        conta1.exibirSaldo();
     */





        //Encapsulamento e Inicialização

        /*
        Produto p1 = new Produto("Acai", 12, 5);
        Produto p2 = new Produto("Ryzen 5600GT", 900, 4);
        p1.calcularValorTotal();
        p2.calcularValorTotal();


        Aluno aluno1 = new Aluno("Arthur", 3 , 10);
        Aluno aluno2 = new Aluno("Arthur", 0 , 5);
        aluno1.calcularMedia();
        aluno2.calcularMedia();


        Funcionario fun1 = new Funcionario("Leticia", "caixa", 1400);
        Funcionario fun2 = new Funcionario("Arthur", "auxiliar-administrativa", 3100);
        Funcionario fun3 = new Funcionario("Laura", "gerente", 5560);
        fun1.aumentarSalario();
        fun2.aumentarSalario();
        fun3.aumentarSalario();


        Map<String, Agenda> contatos = new HashMap<>();

        contatos.put("Arthur", new Agenda("Arthur", "61 98888-7777"));
        contatos.put("Maria", new Agenda("Maria", "61 99999-6666"));
        contatos.put("João", new Agenda("João", "61 97777-5555"));

        for (Map.Entry<String, Agenda> entry : contatos.entrySet()) {
            Agenda contato = entry.getValue();
            System.out.println("Nome: " + contato.getNome() + " | Número: " + contato.getNumero());
        }


        Carro carro1 = new Carro("Civic", 2020);
        System.out.println("Carro -> modelo: " + carro1.getModelo() + " | ano: " + carro1.getAno());

        Carro carro2 = new Carro();
        carro2.setModelo("Corrola");
        carro2.setAno(2010);
        System.out.println("Carro -> modelo: " + carro2.getModelo() + " | ano: " + carro2.getAno());


        Retangulo retangulo1 = new Retangulo(12, 10);
        Retangulo retangulo2 = new Retangulo(20, 25);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();


        Pessoa pessoa1 = new Pessoa("08433011140", 19);
        Pessoa pessoa2 = new Pessoa("08433011140", 11);
        pessoa1.calcularMaioridade();
        pessoa2.calcularMaioridade();


        Telefone telefone1 = new Telefone(99999999, 888888888, "Vivo");
        Telefone telefone2 = new Telefone(99999999, 0, "TIM");
        telefone1.ligar();
        telefone2.ligar();
        */
    }
}
