package Top_100_coding_questions;

import java.util.Scanner;

//Sum of digits of a number
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int sum =0;
        while(n!=0){
            int last = n%10;
            sum = sum+last;
            n=n/10;
        }
        System.out.println(sum);
    }
}
