import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
       
        String arr2[]=new String[numSubjects];
        for(int i=0;i<numSubjects;i++){
            System.out.print("Enter name of the subject "+(i+1)+" : ");
            arr2[i]=scanner.next();
        }
        int[]arr = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " +arr2[i]+ " (between 0-100): ");
            arr[i] = scanner.nextInt();
            if(arr[i]>100 || arr[i]<0){
                System.out.println("Marks should be between 0-100");
                return;
            }
        }
       
        int totalMarks = 0;
        for (int mark : arr) {
            totalMarks += mark;
        }
       
        double averagePercentage = (double) totalMarks / numSubjects;
       
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 50) {
            grade = "E";
        } else if (averagePercentage >= 40) {
            grade = "F";
        } else{
            grade = "G";
        }
       
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
       
        scanner.close();
    }
}