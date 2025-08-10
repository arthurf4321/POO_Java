public class ContaBancaria {

    private Float saldo;
    private Float limiteChequeEspecial;


    public void consultarSaldo() {
        System.out.println("O saldo disponivel e R$: " + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("O limete do cheque especial e R$: " + limiteChequeEspecial);
    }

    public Boolean usandoChequeEspecial() {
        return saldo < 0;
    }


    public void sacar(Float valor) {
        Float somaSaldoEcheque = saldo + limiteChequeEspecial;

        if (valor <= 0) {
            System.out.println("Valor insuficiente para saque");
            return;
        }
        if (valor > somaSaldoEcheque) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        saldo -= valor;
        System.out.println("Valor sacado " + valor);
    }

    public void pagarBoleto(Float valor) {
        Float somaSaldoECheque = saldo + limiteChequeEspecial;

        if(valor <= 0) {
            System.out.println("Valor invalido");
            return;
        }
        if (valor > somaSaldoECheque) {
            System.out.println("valor invalido");
            return;
        }

        saldo -= valor;
        System.out.println("Boleto pago com sucesso");
    }

    public void depositar(Float valor) {
        if (valor >= 0.1) {
            Float saldoAntes = saldo;
            saldo += valor;

            if (saldoAntes < 0) {
                float usadoChequeEspecial = Math.abs(saldoAntes);

                if (saldo >= 0) {
                    Float taxa = usadoChequeEspecial * 0.2f;
                    saldo -= taxa;
                    System.out.println("Taxa de cheque especial cobrado R$ : " + taxa);
                }
            }
            System.out.println("Saldo após depósito: R$ " + saldo);
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }

    public ContaBancaria(Float saldoInicial) {
        this.saldo = saldoInicial;

        if (saldoInicial <= 500) {
            this.limiteChequeEspecial = 50f;
        }else {
            this.limiteChequeEspecial = saldoInicial * 0.5f;
        }
    }
}
