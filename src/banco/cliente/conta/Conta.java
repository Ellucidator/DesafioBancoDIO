package banco.cliente.conta;

import banco.cliente.pessoa.Cliente;
import banco.sistema.Banco;

import java.util.Random;

public class Conta {
    private static final int AGENCIA_PADRAO = 0001;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.saldo = 0d;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;

    }
    public void transferir(double valor, Banco banco, int numeroDaContaDestino, TipoDeConta tipo){
            this.sacar(valor);
            if(tipo == TipoDeConta.CORRENTE){
                banco.acessarContaCorrente(numeroDaContaDestino).depositar(valor);
            } else if (tipo == TipoDeConta.POUPANCA) {
                banco.acessarContaPoupanca(numeroDaContaDestino).depositar(valor);
            }


    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void imprimirExtrato(){
        System.out.println("Nome: "+ this.cliente.getName());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numeroDaConta);
        System.out.printf("Saldo: %.2f", this.saldo);
    }

}
