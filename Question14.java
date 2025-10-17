package Top_100_coding_questions;

import java.util.Scanner;

//check whether a number is perfect number or not
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum ==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
