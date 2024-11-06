package banco.cliente.conta;

import banco.cliente.pessoa.Cliente;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.numeroDaConta= SEQUENCIAL++;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numeroDaConta=" + numeroDaConta +
                ", agencia=" + agencia +
                ", saldo=" + saldo +

                '}';
    }
}
