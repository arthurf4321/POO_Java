package POO.POO_Basic;

public class ContaBancaria {

    // Saldo atual da conta
    private Float saldo;
    // Limite disponível do cheque especial
    private Float limiteChequeEspecial;

    // Consulta o saldo disponível na conta
    public void consultarSaldo() {
        System.out.println("O saldo disponível é R$: " + saldo);
    }

    // Consulta o limite disponível do cheque especial
    public void consultarChequeEspecial() {
        System.out.println("O limite do cheque especial é R$: " + limiteChequeEspecial);
    }

    // Verifica se a conta está utilizando o cheque especial (saldo negativo)
    public Boolean usandoChequeEspecial() {
        return saldo < 0;
    }

    /**
     * Método para sacar um valor da conta.
     * Verifica se o valor é positivo e se há saldo (incluindo cheque especial) suficiente.
     * Caso contrário, avisa o usuário que o saque não é possível.
     */
    public void sacar(Float valor) {
        Float somaSaldoEcheque = saldo + limiteChequeEspecial;

        if (valor <= 0) {
            System.out.println("Valor inválido para saque");
            return;
        }
        if (valor > somaSaldoEcheque) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        saldo -= valor;
        System.out.println("Valor sacado: " + valor);
    }

    /**
     * Método para pagar um boleto.
     * Valida valor e verifica saldo (com cheque especial).
     * Deduz o valor pago do saldo.
     */
    public void pagarBoleto(Float valor) {
        Float somaSaldoECheque = saldo + limiteChequeEspecial;

        if(valor <= 0) {
            System.out.println("Valor inválido para pagamento");
            return;
        }
        if (valor > somaSaldoECheque) {
            System.out.println("Saldo insuficiente para pagamento");
            return;
        }

        saldo -= valor;
        System.out.println("Boleto pago com sucesso");
    }

    /**
     * Método para depositar dinheiro na conta.
     * Aceita depósitos acima de R$0,10.
     * Se o saldo antes do depósito era negativo (usando cheque especial), cobra taxa de 20% sobre o valor usado do cheque.
     */
    public void depositar(Float valor) {
        if (valor >= 0.1) {
            Float saldoAntes = saldo;
            saldo += valor;

            if (saldoAntes < 0) {
                float usadoChequeEspecial = Math.abs(saldoAntes);

                if (saldo >= 0) {
                    Float taxa = usadoChequeEspecial * 0.2f;
                    saldo -= taxa;
                    System.out.println("Taxa de cheque especial cobrada: R$ " + taxa);
                }
            }
            System.out.println("Saldo após depósito: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    /**
     * Construtor que inicializa o saldo da conta e define o limite do cheque especial.
     * Se o saldo inicial for menor ou igual a 500, o limite é fixado em 50.
     * Caso contrário, o limite é 50% do saldo inicial.
     */
    public ContaBancaria(Float saldoInicial) {
        this.saldo = saldoInicial;

        if (saldoInicial <= 500) {
            this.limiteChequeEspecial = 50f;
        } else {
            this.limiteChequeEspecial = saldoInicial * 0.5f;
        }
    }
}
