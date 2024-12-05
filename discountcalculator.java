import java.util.Scanner;
//Navarro,Sean Ray Raphael N. 
//CITCS 
//CC2 1N-A
public class discountcalculator {
    public static void main (String[] args) {
        Scanner calc = new Scanner (System.in);

        System.out.println("Enter total purchase ammount: ");
        int total = calc.nextInt();
        //if, else if, else condition
        float Total;
        if (total >= 0 && total <= 1000) {
            Total = 0.0f;
        }else if (total >= 1001 && total <= 5000) {
            Total = 0.5f;
        }else if (total >= 5001 && total <= 10000){
            Total = 10.00f;
        } else {
            Total = 0.15f;
        }
        //final product
        double Discount = Total; 
        double discount = total * (Total / 100);
        double ammount = (total - discount);
        //output
        System.out.println("Final price:" + ammount);
        System.out.println(Total + "%" + " Discount was applied ");
        
        calc.close();



    }
}
