import entities.Products;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] vet = new String[] {"Maria", "João", "Matheus"};

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        System.out.println("-------------");

        for (String nome : vet) {
            System.out.println(nome);
        }
    }
}