package week1;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of grades to input:");
        Grades grades = new Grades();
        int numberOfGrade = input.nextInt();
        grades.setValues(new int[numberOfGrade]);
        for (int i = 0; i < numberOfGrade; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            grades.getValues()[i] = input.nextInt();
        }
        boolean coti = true;
        int choice = 0;
        while (coti) {
            System.out.println("Chose your option(-1 to quite):\n1.Highest Grade\n2.Lowest Grade\n3.Number of Grades\n4.Average Grade\n5.Number of Failing Grades\n6.Histogram");
            choice = input.nextInt();
            if(choice == 1){
                System.out.println("Highest Grade: " + grades.highest());
            }else if (choice == 2) {
                System.out.println("Lowest Grade: " + grades.lowest());
            }else if (choice == 3) {
                System.out.println("Number of Grades: " + grades.numOfGrade());
            } else if (choice == 4) {
                System.out.println("Average Grade: " + grades.average());
            }else if (choice == 5) {
                System.out.println("Enter a Passing Score:");
                System.out.println("Number of Failing Grades: " + grades.numOfFailingGrades(input.nextInt()));
            }else if (choice == 6) {
                grades.histogram();
            }else {
                coti = false;
            }

        }
    }
}
