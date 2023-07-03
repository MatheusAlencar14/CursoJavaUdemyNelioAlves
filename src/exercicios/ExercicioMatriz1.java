package exercicios;

import java.util.Scanner;

public class ExercicioMatriz1 {
    public static void main(String[] args) {

        /*Um programa que faça uma matriz a partir dos números n e m. Em seguida, ler um número x
        pertencente à matriz e mostrar, para cada ocorrência de x, o valor dos números acima,
        à esquerda, à direita e abaixo.*/

        Scanner scan = new Scanner(System.in);

        int m, n, x;
        System.out.println("Digite o número de linhas: ");
        m = scan.nextInt();
        System.out.println("Digite o número de colunas: ");
        n = scan.nextInt();
        int [][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Digite o número a ser procurado: ");
        x = scan.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição do número " + x + ": Linha: " + i + ", Coluna: " + j);
                }
            }
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz [i][j - 1]);
                    }
                    if (j < matriz.length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        scan.close();
    }
}
