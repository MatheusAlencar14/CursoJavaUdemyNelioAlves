import entities.Products;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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

        System.out.printf("Os dados do produto são: \nNome: " + product.name + "\nPreço: "
                + product.price + "\nQuantidade em estoque: " + product.quantity
                + "\nValor total do estoque: %.3f%n", totalValue);

        System.out.println("\nIndique a quantidade adicional do produto: ");
        int quantityAdd = scan.nextInt();
        product.addProducts(quantityAdd);
        totalValue = product.totalValueInStock();

        System.out.printf("\nOs dados do produto são: \nNome: " + product.name + "\nPreço: "
                + product.price + "\nQuantidade em estoque: " + product.quantity
                + "\nValor total do estoque: %.3f%n", totalValue);

        System.out.println("\nIndique a quantidade de produtos removidos: ");
        int quantityRemove = scan.nextInt();
        product.removeProducts(quantityRemove);
        totalValue = product.totalValueInStock();

        System.out.printf("\nOs dados do produto são: \nNome: " + product.name + "\nPreço: "
                + product.price + "\nQuantidade em estoque: " + product.quantity
                + "\nValor total do estoque: %.3f%n", totalValue);
        
        scan.close();
        }
    }