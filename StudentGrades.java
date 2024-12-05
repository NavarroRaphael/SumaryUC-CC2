public class StudentGrades {
    public static void main(String[]args){
        String studentNames [] = {"Eliana", "Sebastian", "Phillip", "Aubrey", "Chloe", "Zyllah"};

        int grades [][] = {
            {85,76,77},
            {88,81,87},
            {90,81,88},
            {91,93,92},
            {77,78,90},
            {100,99,90}
        };

        for (int i = 0; i < studentNames.length; i++ ){
            int total = 0;

            for (int j = 0; j <grades [i].length; j++){
                total += grades[i][j];
            }
            double average = total / (double) grades[i].length;

            System.out.println(studentNames[i] + "'s Average grade:" + average);
        }

    }
}
