package Top_100_coding_questions;

import java.util.Scanner;

//sum of first N natural numbers
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
