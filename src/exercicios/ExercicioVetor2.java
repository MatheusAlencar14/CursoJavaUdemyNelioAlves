package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de pessoas: ");
        int n = scan.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i < n; i++) {
            scan.nextLine();
            System.out.println("Digite os dados da " + (i+1) + "ª pessoa: ");
            System.out.println("Nome:");
            nome[i] = scan.nextLine();
            System.out.println("Idade: ");
            idade[i] = scan.nextInt();
            System.out.println("Altura: ");
            altura[i] = scan.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < altura.length; i++) {
            soma += altura[i];
        }

        double media = soma / altura.length;
        System.out.printf("\nA média de altura é: %.2f%n", media);

        int menosDezesseis = 0;
        for(int i = 0; i < idade.length; i++) {
            if(idade[i] < 16) {
                menosDezesseis++;
            }
        }
        double porcentagem = menosDezesseis * 100.0 / idade.length;
        System.out.printf("\nA porcentagem de pessoas menor que 16 anos é: %.1f%%%n"
                , porcentagem);

        for(int i = 0; i < idade.length; i++) {
            if(idade[i] < 16) {
                System.out.println("Nome: " + nome[i]);
            }
        }
    }
}
