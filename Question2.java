package Top_100_coding_questions;

import java.util.Scanner;

//Check whether a number is positive or negative
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        } else if (n==0) {
            System.out.println("Zero");

        }
        else{
            System.out.println("Negative");
        }
    }
}
