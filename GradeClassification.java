import java.util.Scanner;

public class GradeClassification {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i < 5;){
        System.out.print("Enter grade for student" +i+ ":");
        int grade = scanner.nextInt();
        
        if (grade > 90){
            System.out.println("Student"+i+":Excellent");
        }else if(grade >= 70 || grade <= 89){
            System.out.println("Student" +i+ ":Good");
            
        }else{
            System.out.println("Student" + i + ":Needs Improvement");
        }   
      }
      scanner.close();
    }    
}
