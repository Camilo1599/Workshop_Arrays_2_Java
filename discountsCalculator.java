import java.util.Arrays;
import java.util.Scanner;
public class discountsCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Mango", "Manzana", "pera", "Fresa"};
        double[] prices = {900, 400, 300, 500};
        double discount, newBill=0, bill=0;
        double amount=0;

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));

        for (int i = 0; i < products.length; i++) {
            System.out.println("Ingrese que cantidad de "+ products[i]+" desea llevar" );
            amount = scanner.nextDouble();
            bill += amount * prices[i];
        }

        if(bill >= 1000){
            discount = 0.75;
            newBill = bill * discount; 
        }else if(bill >= 500){
            discount = 0.80;
            newBill = bill * discount;
        }else if(bill >= 300){
            discount = 0.85;
            newBill = bill * discount;
        }else if(bill >= 200){
            discount = 0.90;
            newBill = bill * discount;
        }else if(bill < 200){
            newBill = bill;
        }

        System.out.println("tu factura es de:  " + bill + " Con descuento quedo en: " + newBill);

        scanner.close();
    }
}
