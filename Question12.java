package Top_100_coding_questions;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int original = sc.nextInt();
        int n = original;
        int rev = 0;
        while(n!=0){
            int last = n%10;
            rev = rev*10 + last;
            n=n/10;
        }
        if(rev==original){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
