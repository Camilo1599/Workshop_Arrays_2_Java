import java.util.Arrays;
import java.util.Scanner;
public class Billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Mango", "Manzana", "pera"};
        double[] prices = {1000, 3000, 2000};
        double bill=0;
        double amount=0;

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));

        for (int i = 0; i < products.length; i++) {
            System.out.println("Ingrese que cantidad de "+ products[i]+" desea llevar" );
            amount = scanner.nextDouble();
            bill += amount * prices[i];
        }

        System.out.println(bill);
        scanner.close();
    }
}
