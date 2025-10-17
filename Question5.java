package Top_100_coding_questions;

import java.util.Scanner;

//Find the greatest between two numbers
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("First number is greatest");
        }
        else{
            System.out.print("Second number is greatest");
        }
    }
}
