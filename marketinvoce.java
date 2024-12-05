import java.util.Scanner;
// Navarro, Sean Ray Raphael N. 
//CITCS 1N-A 
//CC2
//13/09/2024
public class marketinvoce {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input for item 1 and Quantity 1.
        System.out.println(" Enter item of price 1: ");
        double price1 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1: ");
        double quantity1 = scanner.nextDouble();
        //input for item 2 and Quantity 2.
        System.out.println(" Enter item of price 2: ");
        double price2 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 2: ");
        double quantity2 = scanner.nextDouble();
        //input for item 3 and Quantity 3.
        System.out.println(" Enter item of price 3: ");
        double price3 = scanner.nextDouble();
        System.out.println("Enter the quantity quantity 3: ");
        double quantity3 = scanner.nextDouble();


        //calculation for all Items.
        double subtotal = (price1*quantity1) + (price2*quantity2) + (price3*quantity3);
        double discount = subtotal*0.05;
        double salesTax = (subtotal - discount) * 0.12;
        double Total =  (subtotal - discount) + salesTax;
        // Output.
        System.out.println(" Subtotal : " + subtotal);
        System.out.println(" Discount: " + discount);
        System.out.println("Sales tax: " + salesTax);
        System.out.println(" Total: " + Total); 
        


        
        

        scanner.close();

    }
}
