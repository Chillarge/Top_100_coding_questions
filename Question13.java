package Top_100_coding_questions;

import java.util.Scanner;
import java.util.*;
//check whether a number is amstrong or not
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int original = sc.nextInt();
        int n = original;
        int len = String.valueOf(original).length();
        int sum =0;
        while(n!=0){
            int last = n%10;
            sum += Math.pow(last,len);
            n=n/10;

        }
        if(sum == original){
            System.out.println("Number is  Amstrong");
        }
        else{
            System.out.println("Number is not Amstrong");
        }

    }
}
