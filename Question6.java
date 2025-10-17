package Top_100_coding_questions;

import java.util.Scanner;

//Find the greatest of Three numbers
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.print("Enter the Third number:");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("First number is greatest");
        } else if (b>a && b>c) {
            System.out.println("Second number is greatest");
        }
        else{
            System.out.println("Third number is greatest");
        }
    }
}
