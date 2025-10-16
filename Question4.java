package Top_100_coding_questions;

import java.util.Scanner;

//sum of numbers in a given range
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0;
        for(int i = a;i<=b;i++){
            sum = sum+i;
        }
        System.out.print(sum);
    }

}
