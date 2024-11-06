package banco.cliente.pessoa;

import banco.cliente.conta.ContaCorrente;
import banco.cliente.conta.ContaPoupanca;

import java.util.Random;

public class Cliente {
    private static int SEQUECIAL = 1;

    protected int id;
    protected String name;
    protected ContaPoupanca contaPoupanca;
    protected ContaCorrente contaCorrente;

    public Cliente(String name) {
        id = SEQUECIAL++;
        this.name = name;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void criarContaPoupanca(){
        if(contaPoupanca != null) return;
        this.contaPoupanca= new ContaPoupanca(this);
    }

    public void criarContaCorrente(){
        if(contaCorrente != null) return;
        this.contaCorrente= new ContaCorrente(this);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contaPoupanca=" + contaPoupanca +
                ", contaCorrente=" + contaCorrente +
                '}';
    }
}
