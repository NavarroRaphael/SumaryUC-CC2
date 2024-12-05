import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ClassAttendanceSYS {
    public static void main(String [] args){
        Scanner sys = new Scanner(System.in);

        System.out.println("Enter total number of students:");
        int studentnum = sys.nextInt();
        
        System.out.println("Enter the total number of students: ");
        int StudentTotal = sys.nextInt();

        int present = 0;
        int absent = 0;

        for(int i = 1 ; i <= StudentTotal ; i++){
            while(true){
                System.out.print("Is student " + i + "present? (Y/N):");
                char YesNo = scanner.next().charAt(0);
            
            if (YesNo == 'Y' || YesNo == 'y') {
                present++;
                break;
            } else if (YesNo == 'N' || YesNo == 'n'){
                absent++;
                break;
            }else{
                System.out.println("Invalid Input");
            }
            }
        }
        System.out.println("Total present:" + present);
        System.out.println("Total absent" + absent);
        
        
        sys.close();
        
   }

}