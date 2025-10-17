package Top_100_coding_questions;

import java.util.Scanner;

//check whether a number is prime or not
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count ==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
