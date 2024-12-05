import java.text.NumberFormat.Style;
import java.util.Scanner;
//Navarro,Sean Ray Raphael N. 
//CITCS 1N-A
//CC2
//09/28/2024
public class actfive {
    public static void main(String [] args) {
        Scanner prc = new Scanner(System.in);
        //Menu
        System.out.println("MENU");
        System.out.println("\nBurger - PHP100" + "\nFries - PHP50" + "\nSoda - PHP30" + "\nIce cream - PHP45");
        System.out.println("EXIT");

        System.out.println("Please enter order");
        int menu = prc.nextInt();

        if (menu == 5){
            System.out.println("Thank you for odering ");
            return;
        }
        System.out.println("Enter order quantity");
        double quantity = prc.nextDouble();
        //
        double total = 0.00;
        switch (menu) {
            case 1:
                total = 100*quantity;
                System.out.println("You ordered a burger");
                break;
            case 2:
                total = 50*quantity;
                System.out.println("You ordered fries");
                break;
            case 3:
                total = 30*quantity;
                System.out.println("You ordered soda");
                break;
            case 4:    
                total = 45*quantity;
                 System.out.println("You ordered Ice cream");
            break;
            default:

            System.out.println("Please enter your Order");
            return;
        }
        System.out.printf("Total: " + (menu + total) + "PHP" );

        prc.close();
    }
}
