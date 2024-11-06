package banco.sistema;

import banco.cliente.conta.Conta;
import banco.cliente.pessoa.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> bancoDeContas;

    public Banco() {
        this.bancoDeContas = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.bancoDeContas.add(cliente);
    }


    public Conta acessarContaCorrente(int numeroDaconta){
        return bancoDeContas.stream()
                .filter(c -> c.getContaCorrente() != null && c.getContaCorrente().getNumeroDaConta() == numeroDaconta)
                .findFirst()
                .orElse(null).getContaCorrente();
    }
    public Conta acessarContaPoupanca(int numeroDaconta){
        return bancoDeContas.stream()
                .filter(c -> c.getContaPoupanca() != null && c.getContaPoupanca().getNumeroDaConta() == numeroDaconta )
                .findFirst()
                .orElse(null).getContaPoupanca();
    }

    @Override
    public String toString() {
        return "Banco{" +
                "bancoDeContas=" + bancoDeContas.get(1) +
                '}';
    }
}
