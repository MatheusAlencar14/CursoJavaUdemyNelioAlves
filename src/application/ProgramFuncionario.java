package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionário: ");
        funcionario.nome = scan.nextLine();
        System.out.println("Digite o salário bruto do funcionário: ");
        funcionario.salarioBruto = scan.nextDouble();
        System.out.println("Digite o valor da taxa: ");
        funcionario.taxa = scan.nextDouble();

        System.out.println("Dados do funcionário: " + funcionario);

        double porcentagem;
        System.out.println("\nDigite o valor da porcentagem: ");
        porcentagem = scan.nextDouble();

        funcionario.aumentoSalario(porcentagem);

        System.out.println("\nDados do funcionário: " + funcionario);

        scan.close();
    }
}
