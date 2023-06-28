package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProducts {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Products product = new Products();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dados do Produto: ");
        System.out.println("Nome: ");
        product.name = scan.nextLine();
        System.out.println("Preço: ");
        product.price = scan.nextDouble();
        System.out.println("Quantidade em Estoque: ");
        product.quantity = scan.nextInt();

        double totalValue = product.totalValueInStock();

        System.out.println("Dados do produto: " + product);


        System.out.println("\nIndique a quantidade adicional do produto: ");
        int quantityAdd = scan.nextInt();
        product.addProducts(quantityAdd);
        totalValue = product.totalValueInStock();

        System.out.println("Dados do produto: " + product);

        System.out.println("\nIndique a quantidade de produtos removidos: ");
        int quantityRemove = scan.nextInt();
        product.removeProducts(quantityRemove);
        totalValue = product.totalValueInStock();

        System.out.println("Dados do produto: " + product);

        scan.close();
    }
}
