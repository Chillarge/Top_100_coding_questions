package Top_100_coding_questions;

import java.util.Scanner;
//Reverse of a number
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int rev =0;
        while(n!=0){
            int last = n%10;
             rev = rev*10 + last;
             n=n/10;
        }
        System.out.println(rev);

    }
}
