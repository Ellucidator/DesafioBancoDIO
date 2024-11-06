import banco.cliente.conta.Conta;
import banco.cliente.conta.TipoDeConta;
import banco.cliente.pessoa.Cliente;
import banco.sistema.Banco;


public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente primeiroCliente = new Cliente("Marcelo");
        primeiroCliente.criarContaCorrente();
        banco.addCliente(primeiroCliente);

        Cliente segundoCliente = new Cliente("Gabriella");
        segundoCliente.criarContaPoupanca();
        banco.addCliente(segundoCliente);

        Conta acesso = banco.acessarContaCorrente(1);
        acesso.depositar(30);

        Conta acesso2 = banco.acessarContaPoupanca(1);

        acesso.transferir(5,banco,1, TipoDeConta.POUPANCA);
        acesso.imprimirExtrato();
        acesso2.imprimirExtrato();
    }

}