package Top_100_coding_questions;

import java.util.Scanner;

//check whether a year is leap year or not
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int n = sc.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
