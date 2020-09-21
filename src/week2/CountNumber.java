package week2;

import java.util.Scanner;

public class CountNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[51];
        int number = 0;
        boolean conti = true;
        while (conti) {
            System.out.println("Enter a value between 0 and 50 [ -1 to end ]:");
            number = input.nextInt();
            if (number == -1) {
                conti = false;
            } else if (number > 50 || number < 0){
                System.out.println("The entered range is wrong, please re-enter！");
            }else {
                for (int i = 0; i < nums.length; i++) {
                    if (i == number) {
                        nums[i]++;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println("The value of " + i + " has " + nums[i] + " occurrences.");
            }
        }


    }

}
