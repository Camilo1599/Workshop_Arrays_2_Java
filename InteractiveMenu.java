import java.util.Scanner;

public class InteractiveMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        double add=0, subtract=0, divide=1, multiply=1;
        
        while (flag) {
            System.out.println("\nChose an Option:\n1.Add\n2.substract\n3.Divide\n4.Multiply\n5.Exit");
            int option = scanner.nextInt();

            if(option == 5){
                System.out.println("Thanks for choosing");
                flag = false;

            }else if(option ==1 ){
                System.out.println("Number A:");
                double num1 = scanner.nextInt();
                System.out.println("Number B:");
                double num2 = scanner.nextInt();
                add = num1 + num2;
                System.out.println("The sum:" + num1 + "+" + num2+ " is: " + add);

            }else if(option == 2 ){
                System.out.println("Number A:");
                double num1 = scanner.nextInt();
                System.out.println("Number B:");
                double num2 = scanner.nextInt();
                subtract = num1 - num2;
                System.out.println("The Substract:" + num1 + "-" + num2+ " is: " + subtract);

            }else if(option == 3 ){
                System.out.println("Number A:");
                double num1 = scanner.nextInt();
                System.out.println("Number B:");
                double num2 = scanner.nextInt();
                divide = num1 / num2;
                System.out.println("The division:" + num1 + "/" + num2+ " is: " + divide);

            }else if(option == 4){
                System.out.println("Number A:");
                double num1 = scanner.nextInt();
                System.out.println("Number B:");
                double num2 = scanner.nextInt();
                multiply = num1 - num2;
                System.out.println("The multiplication:" + num1 + "x" + num2+ " is: " + multiply);
            } else{
                System.out.println("Invalid Option");
            }
        }
        scanner.close();
    }
}
