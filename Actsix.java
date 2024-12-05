//Navarro,Sean Ray Raphael N.
//CITCS 1N-A (BSIT)
//CC2 (10/26/2024)
import java.util.Scanner;
public class Actsix {
    public static void main(String[]args){
        Scanner six = new Scanner(System.in);

        //Input number of students
        System.out.println("\nEnter the total number of students:");
        int allstudent = six.nextInt();

        int present = 0;
        int absent = 0;

        //loop for each student present or absent
        for (int i = 1; i <= allstudent; i ++){
            System.out.print("Is Student " + i + "present? (Y/N): ");
            char attendance = six.next().charAt(0);

            //Sums the present and absent student
            if (attendance == 'Y' || attendance == 'y'){
                present++;
            }else if (attendance == 'N' || attendance == 'n'){
                absent++;
            }else{
                System.out.println("\nInvalid input, please enter 'Y' or 'N'. ");
                i--;
            }
        }
        System.out.println("\nTotal present " + present);
        System.out.println("Total absent" + absent);
    
        six.close();
    }
}
