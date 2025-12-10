import POO.Encapsulamento_E_Comportamento.*;
import POO.Encapsulamento_inicialização.*;
import POO.Heranca_Polimorfismo.Exercicio_1.*;
import POO.Heranca_Polimorfismo.Exercicio_10.ContaCorrente;
import POO.Heranca_Polimorfismo.Exercicio_10.ContaPoupanca;
import POO.Heranca_Polimorfismo.Exercicio_2.*;
import POO.Heranca_Polimorfismo.Exercicio_3.*;
import POO.Heranca_Polimorfismo.Exercicio_4.Animal;
import POO.Heranca_Polimorfismo.Exercicio_4.Cachorro;
import POO.Heranca_Polimorfismo.Exercicio_4.Gato;
import POO.Heranca_Polimorfismo.Exercicio_4.Pássaro;
import POO.Heranca_Polimorfismo.Exercicio_5.Veiculo;
import POO.Heranca_Polimorfismo.Exercicio_6.Funcionario;
import POO.Heranca_Polimorfismo.Exercicio_6.Vendedor;
import POO.Heranca_Polimorfismo.Exercicio_7.Pessoa;
import POO.Heranca_Polimorfismo.Exercicio_7.Aluno;
import POO.Heranca_Polimorfismo.Exercicio_7.Professor;
import POO.Heranca_Polimorfismo.Exercicio_8.Ingresso;
import POO.Heranca_Polimorfismo.Exercicio_8.IngressoNormal;
import POO.Heranca_Polimorfismo.Exercicio_8.IngressoVIP;
import POO.Heranca_Polimorfismo.Exercicio_9.Circulo;
import POO.Heranca_Polimorfismo.Exercicio_9.Quadrado;
import POO.Heranca_Polimorfismo.Exercicio_9.Triangulo;
import POO.POO_Basic.*;
import POO.Polimorfismo_e_Abstração.Exercicio_1.Circulo2;
import POO.Polimorfismo_e_Abstração.Exercicio_1.Triangulo2;
import POO.Polimorfismo_e_Abstração.Exercicio_2.Autenticavel;
import POO.Polimorfismo_e_Abstração.Exercicio_2.Cliente;
import POO.Polimorfismo_e_Abstração.Exercicio_3.Boleto;
import POO.Polimorfismo_e_Abstração.Exercicio_3.CartaoCredito;
import POO.Polimorfismo_e_Abstração.Exercicio_3.Pagamento;
import POO.Polimorfismo_e_Abstração.Exercicio_3.Pix;
import POO.Polimorfismo_e_Abstração.Exercicio_4.Estagiario;
import POO.Polimorfismo_e_Abstração.Exercicio_4.Funcionario10;
import POO.Polimorfismo_e_Abstração.Exercicio_4.Gerente;
import POO.Polimorfismo_e_Abstração.Exercicio_4.Programador;

public class Main {
    public static void main(String[] args) {

        // =====================================================
        // POO Basic (comentado)
        /*
        // ----------- Pessoa -----------
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "jopa";
        pessoa1.idade = 12;
        pessoa1.falar();

        // ----------- Carro -----------
        CarroInfos carro1 = new CarroInfos();
        carro1.modelo = "Civic";
        carro1.ano = 2007;
        carro1.marca = "Honda";
        carro1.exibirInfos();

        // ----------- Cachorro -----------
        Cachorro cachorro1 = new Cachorro();
        cachorro1.raca = "PitBul";
        cachorro1.nome = "Trevoso";
        cachorro1.idade = 12;
        cachorro1.latir();
        cachorro1.exameIdade();
        cachorro1.exameRaca();

        // ----------- Livro -----------
        Livro livro1 = new Livro();
        livro1.autor = "Arthur";
        livro1.titulo = "O mundo por tras da sociedade";
        livro1.ano = 1930;
        livro1.exibirInfos();

        // ----------- Celular -----------
        Celular celular1 = new Celular();
        celular1.marca = "Android";
        celular1.modelo = "A15";
        celular1.statsCelular = false;
        celular1.ligar();
        celular1.desligar();

        // ----------- Caneta -----------
        Canetta caneta1 = new Canetta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5;
        caneta1.escrever();

        // ----------- Computador -----------
        Computador computador1 = new Computador();
        computador1.processador = "Ryzen 5600GT";
        computador1.ram = 16.0;
        computador1.statsComputador = false;
        computador1.ligar();
        computador1.desligar();

        // ----------- Filme -----------
        Filme filme1 = new Filme();
        filme1.titulo = "Planeta do macacos";
        filme1.descricao = "Muitas sociedades de macacos cresceram...";
        filme1.duracao = 2.30;
        filme1.autor = "Pierre Boille";
        filme1.diretor = "Franklin J. Schaffner, Don Taylor, Ted Post, J. Lee Thompson";
        filme1.exibirInfos();

        // ----------- Conta Bancária -----------
        ContaBancaria2 conta1 = new ContaBancaria2();
        conta1.valor = 100;
        conta1.depositar();
        conta1.sacar();
        conta1.exibirSaldo();
        */

        // =====================================================
        // Encapsulamento e Inicialização (comentado)
        /*
        // ----------- Produto -----------
        Produto p1 = new Produto("Acai", 12, 5);
        Produto p2 = new Produto("Ryzen 5600GT", 900, 4);
        p1.calcularValorTotal();
        p2.calcularValorTotal();

        // ----------- Aluno -----------
        Aluno aluno1 = new Aluno("Arthur", 3, 10);
        Aluno aluno2 = new Aluno("Arthur", 0, 5);
        aluno1.calcularMedia();
        aluno2.calcularMedia();

        // ----------- Funcionário -----------
        Funcionario fun1 = new Funcionario("Leticia", "caixa", 1400);
        Funcionario fun2 = new Funcionario("Arthur", "auxiliar-administrativa", 3100);
        Funcionario fun3 = new Funcionario("Laura", "gerente", 5560);
        fun1.aumentarSalario();
        fun2.aumentarSalario();
        fun3.aumentarSalario();

        // ----------- Agenda -----------
        Map<String, Agenda> contatos = new HashMap<>();
        contatos.put("Arthur", new Agenda("Arthur", "61 98888-7777"));
        contatos.put("Maria", new Agenda("Maria", "61 99999-6666"));
        contatos.put("João", new Agenda("João", "61 97777-5555"));

        for (Map.Entry<String, Agenda> entry : contatos.entrySet()) {
            Agenda contato = entry.getValue();
            System.out.println("Nome: " + contato.getNome() + " | Número: " + contato.getNumero());
        }

        // ----------- Carro -----------
        Carro carro1 = new Carro("Civic", 2020);
        System.out.println("Carro -> modelo: " + carro1.getModelo() + " | ano: " + carro1.getAno());

        Carro carro2 = new Carro();
        carro2.setModelo("Corrola");
        carro2.setAno(2010);
        System.out.println("Carro -> modelo: " + carro2.getModelo() + " | ano: " + carro2.getAno());

        // ----------- Retângulo -----------
        Retangulo retangulo1 = new Retangulo(12, 10);
        Retangulo retangulo2 = new Retangulo(20, 25);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

        // ----------- Pessoa -----------
        Pessoa pessoa1 = new Pessoa("08433011140", 19);
        Pessoa pessoa2 = new Pessoa("08433011140", 11);
        pessoa1.calcularMaioridade();
        pessoa2.calcularMaioridade();

        // ----------- Telefone -----------
        Telefone telefone1 = new Telefone(99999999, 888888888, "Vivo");
        Telefone telefone2 = new Telefone(99999999, 0, "TIM");
        telefone1.ligar();
        telefone2.ligar();

        // ----------- Música -----------
        Musica musica1 = new Musica("arthur", " rafaaekl", 2, true);
        Musica musica2 = new Musica("Julia", "Paulo", 3, false);
        musica1.tocar();
        musica1.desligar();
        musica2.tocar();
        musica2.desligar();
        */

        // =====================================================
        // Encapsulamento e Comportamento
        /*
        // ----------- Elevador -----------
        Elevador usuario1 = new Elevador(20, 6);
        usuario1.entrar();
        usuario1.subir();
        usuario1.descer();
        usuario1.sair();

        // ----------- Banco -----------
        Banco conta1 = new Banco("Arthur", 1000.0);
        Banco conta2 = new Banco("Maria", 500.0);
        System.out.println(conta1.getNome() + " saldo inicial: " + conta1.getValor());
        System.out.println(conta2.getNome() + " saldo inicial: " + conta2.getValor());

        conta1.Transferir(conta2, 300);
        System.out.println(conta1.getNome() + " saldo final: " + conta1.getValor());
        System.out.println(conta2.getNome() + " saldo final: " + conta2.getValor());

        // ----------- Mercado -----------
        Mercado produto1 = new Mercado("Melancia", "17/8/2019", 3);
        produto1.verder();
        System.out.println(produto1.getEstoque() + " Estoque");

        // ----------- Loja Virtual -----------
        LojaVirtual loja = new LojaVirtual(); // Construtor sem parâmetro
        loja.adicionarCliente("Arthur");
        loja.adicionarCliente("Maria");
        loja.listarClientes();
        loja.registrarCompras();
        loja.registrarCompras();
        System.out.println("Total de vendas registradas: " + loja.getCompras());

        // ----------- Termômetro -----------
        Termometro pedro = new Termometro(35);
        Termometro marcos = new Termometro(36);

        pedro.aumentarTemp();
        pedro.converterParaFahrenheit();
        pedro.converterParaCelsius(96.8);

        marcos.diminuirTemp();
        marcos.converterParaFahrenheit();
        marcos.converterParaCelsius(95);

        // ----------- ControleRemoto -----------
        ControleRemoto controle1 = new ControleRemoto(2, 4);
        ControleRemoto controle2 = new ControleRemoto(1, 10);

        controle1.aumentarVolume();
        controle1.diminuirVolume();
        controle1.descerCanal();
        controle1.subirCanal();

        controle2.aumentarVolume();
        controle2.diminuirVolume();
        controle2.descerCanal();
        controle2.subirCanal();

        // ----------- Semaforo -----------
        Semaforo semaforo1 = new Semaforo("Amarelo");
        semaforo1.newStats_Verde();
        semaforo1.newStats_Amarelo();
        semaforo1.newStats_Vermelho();

        // ----------- Lampada -----------
        Lampada lampada = new Lampada(false);
        lampada.changeStatus();

        // ----------- Estoque -----------
        Estoque estoque = new Estoque(2);
        estoque.adicionarProduto();
        estoque.retirarProduto();
        estoque.verificarQuanridade();

        // ----------- Corrida -----------
        Corrida corrida1 = new Corrida("Arthur", "Bia", 10, 9);
        corrida1.playerWin();



        // =====================================================
        // Herança
        // ----------- Animal -----------
        Cachorro cachorro = new Cachorro("Duck", "AUau", 12);
        Gato gato = new Gato("Dante", "Miau", 10);
        Pássaro passaro = new Pássaro("Geu", "PIU", 9);
        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();

        // ----------- Veiculo -----------
        Veiculo veiculo1 = new Veiculo("3334-2211", 2012);
        Veiculo veiculo2= new Veiculo("3334-2211", 2012);
        Veiculo veiculo3 = new Veiculo("3334-2211", 2012);
        veiculo1.Infos();
        veiculo2.Infos();
        veiculo3.Infos();

        // ----------- Funcionario -----------
        Gerente funcionario1 = new Gerente("arthur",  12200);
        Vendedor funcionario2 = new Vendedor("Igor", 2200);
        Estagiario funcionario3 = new Estagiario("Bruno", 750);

        funcionario1.Apresentar();
        funcionario2.Apresentar();
        funcionario3.Apresentar();

        // ----------- Funcionario -----------
        Aluno pessoa1 = new Aluno("Arthur", "12220200222");
        Professor pessoa2 = new Professor("Lucas", "4444445255");

        pessoa1.infos();
        pessoa2.infos();

        // ----------- Ingresso -----------
        IngressoNormal pessoa1 = new IngressoNormal(90);
        IngressoVIP pessoa2 = new IngressoVIP(350);

        pessoa1.Infos();
        pessoa2.Infos();

        // ----------- FormasGeometricas -----------
        Quadrado forma1 = new Quadrado(10.0);
        forma1.Infos();
        forma1.Area();

        Triangulo forma2 = new Triangulo(5.0, 3.0);
        forma2.Infos();
        forma2.Area();

        Circulo forma3 = new Circulo(10.0);
        forma3.Infos();
        forma3.area();

        // ----------- ContaBancaria -----------
        ContaCorrente conta1 = new ContaCorrente(10000);
        ContaPoupanca conta2 = new ContaPoupanca(20000);
        conta1.Infos();
        conta2.Infos();
        conta2.rendimento();


        // =====================================================
        // Polimorfismo e Abstracao
        // ----------- Formas -----------
        Circulo2 forma1 = new Circulo2(10);
        Retangulo forma2 = new Retangulo(10, 5);
        Triangulo2 forma3 = new Triangulo2(10,7);
        forma1.calcularArea();
        forma2.calcularArea();
        forma3.calcularArea();

        // ----------- Autenticavel -----------
        Autenticavel a = new Cliente("Arthur", "123");
        Autenticavel b = new Cliente("Lucas", "boot");
        System.out.println("Login Cliente: " + a.autenticar("Arthur", "123"));
        System.out.println("Login Admin: " + b.autenticar("Lucas", "boot"));
        System.out.println("Login Admin (errado): " + a.autenticar("admin", "123"));

        // ----------- Pagamento -----------
        Pagamento a = new CartaoCredito("10000");
        Pagamento b = new Pix("200");
        Pagamento c = new Boleto("1200");
        System.out.println("a " + a.pagar("10000"));
        System.out.println("b " + b.pagar("100"));
        System.out.println("c " + c.pagar("10"));

        */
    }
}
