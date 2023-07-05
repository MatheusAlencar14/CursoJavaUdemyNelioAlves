package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dtf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Diga o departamento: ");
        String departamentName = sc.nextLine();

        System.out.println("Digite os dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nível: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salarial: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

        System.out.print("Quantos contratos o trabalhador terá? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o contrato #" + (i + 1) + ": ");
            System.out.print("Data: ");
            Date contractDate = dtf1.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração do contrato (em horas): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Indique o mês e o ano para cálculo do salário: ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println();
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Salário em " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
