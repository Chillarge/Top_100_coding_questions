package Top_100_coding_questions;

import java.util.Scanner;

//Find the smallest of three numbers
public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println("First number is smallest");
        } else if (b<a && b<c) {
            System.out.println("Second number is smallest");
        }
        else{
            System.out.println("Third number is smalltest");
        }
    }
}
