package exercicios;

import entities.Hotel;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Hotel[] vet = new Hotel[10];
        String nome, email;
        int clientes, quarto;

        System.out.println("Quantos hóspedes precisam de quartos?");
        clientes = scan.nextInt();

        for(int i = 0; i < clientes; i++) {
            scan.nextLine();
            System.out.println("Hóspede #" + (i+1) + ": ");
            System.out.print("Nome: ");
            nome = scan.nextLine();
            System.out.print("Email: ");
            email = scan.nextLine();
            System.out.print("Quarto: ");
            quarto = scan.nextInt();
            vet[quarto] = new Hotel(nome, email);
        }

        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < vet.length; i++) {
            if(vet[i] != null) {
                System.out.println(i + ": " + vet[i]);
            }
        }
        scan.close();
    }
}
