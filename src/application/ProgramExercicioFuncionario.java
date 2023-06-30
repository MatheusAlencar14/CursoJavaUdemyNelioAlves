package application;

import entities.ExercicioFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicioFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<ExercicioFuncionario> func = new ArrayList<>();

        System.out.println("Deseja cadastrar quantos funcionários?");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Funcionário #" + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = scan.nextInt();
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Salário: ");
            Double salario = scan.nextDouble();
            ExercicioFuncionario funcionario = new ExercicioFuncionario(id, nome, salario);
            func.add(funcionario);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (ExercicioFuncionario x : func) {
            System.out.print(x);
        }

        System.out.println();
        System.out.print("Digite o ID do funcionário que receberá o aumento: ");
        int idAumento = scan.nextInt();
        ExercicioFuncionario f1 = func.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        System.out.println(f1);
        if(f1 != null) {
            System.out.print("Digite o percentual de aumento: ");
            double porcentagem = scan.nextDouble();
            f1.aumentoSalario(porcentagem);
        } else {
            System.out.println("Esse ID é inexistente!");
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (ExercicioFuncionario x : func) {
            System.out.print(x);
        }
        scan.close();
    }
}
