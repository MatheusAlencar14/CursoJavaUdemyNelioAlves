import entities.Products;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        Products[] vetor = new Products[n];

        for(int i = 0; i < vetor.length; i++) {
            scan.nextLine();
            System.out.println("\nDigite o nome do produto: ");
            String name = scan.nextLine();
            System.out.println("Digite o preço do produto: ");
            double price = scan.nextDouble();
            vetor[i] = new Products(name, price);
        }

        double soma = 0;

        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPrice();
        }

        double media = soma / n;

        System.out.printf("\nA média do preço dos produtos é: %.2f%n", media);

        scan.close();
        }
    }