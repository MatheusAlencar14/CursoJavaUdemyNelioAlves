package application;

import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArea {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangule x, y;
        x = new Triangule();
        y = new Triangule();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Maior área: X");
        } else {
            System.out.printf("Maior área: Y");
        }
        scanner.close();
    }
}
