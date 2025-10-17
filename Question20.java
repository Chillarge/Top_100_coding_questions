package Top_100_coding_questions;

import java.util.Scanner;

//check whether a number is perfect square or not
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        double sqrt = Math.sqrt(n);
        if(sqrt== Math.floor(sqrt)){
            System.out.println("Is a perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
    }
}
