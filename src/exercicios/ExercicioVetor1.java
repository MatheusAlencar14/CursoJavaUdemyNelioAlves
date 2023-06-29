package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor1 {
    public static void main(String[] args) {
        //Ler um número positivo N e depois N números inteiros, armazenando em um vetor.
        //Em seguida, mostrar na telas os números negativos lidos
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++) {
            scan.nextLine();
            System.out.println("\nDigite um número: ");
            int numero = scan.nextInt();
            vetor[i] = numero;
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        scan.close();
    }
}
