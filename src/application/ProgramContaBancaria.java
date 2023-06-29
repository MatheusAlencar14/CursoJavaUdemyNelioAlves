package application;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ProgramContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scan.nextInt();
        System.out.println("Digite o nome do titular: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.println("Deseja realizar um depósito inicial? S/N");
        char inicial;
        inicial = scan.next().charAt(0);
        ContaBancaria conta;
        if (inicial == 'S') {
            System.out.println("Digite o valor inicial de depósito: ");
            double depositoInicial = scan.nextDouble();
            conta = new ContaBancaria(numeroConta, nome, depositoInicial);
        } else {
            conta = new ContaBancaria(numeroConta, nome);
        }

        System.out.println(conta);

        System.out.println("\nDigite o valor do depósito: ");
        double deposito = scan.nextDouble();
        conta.depositar(deposito);

        System.out.println(conta);

        System.out.println("\nDigite o valor de saque: ");
        double saque = scan.nextDouble();
        conta.sacar(saque);

        System.out.println("\nDados da conta: \n" + conta);
        scan.close();
    }
}
