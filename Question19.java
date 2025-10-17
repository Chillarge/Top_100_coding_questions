package Top_100_coding_questions;

import java.util.Scanner;

//Print power of a number
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        System.out.print("Enter the power");
        int p = sc.nextInt();
        System.out.print("Power of a number is :"+Math.pow(n,p));
    }
}
