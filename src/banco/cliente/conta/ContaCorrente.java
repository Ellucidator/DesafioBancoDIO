package banco.cliente.conta;

import banco.cliente.pessoa.Cliente;

public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.numeroDaConta= SEQUENCIAL++;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +

                ", saldo=" + saldo +
                ", numeroDaConta=" + numeroDaConta +

                '}';
    }
}
