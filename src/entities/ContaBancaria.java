package entities;
public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public ContaBancaria (int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void sacar(double saque) {
        this.saldo -= saque + 5;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta
                + ", Nome do titular: " + nome
                + ", Saldo total: R$ " + saldo ;
    }
}
