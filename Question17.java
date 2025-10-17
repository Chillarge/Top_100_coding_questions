package Top_100_coding_questions;

import java.util.Scanner;

// Find the smallest of Two numbers
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        if(a<b){
            System.out.println("First number is smalltest");
        }
        else{
            System.out.println("Second number is smalltest");
        }
    }
}
