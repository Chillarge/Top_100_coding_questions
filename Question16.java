package Top_100_coding_questions;

import java.util.Scanner;
//fibonacci series from 0 to N
public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        for(int i =1;i<=n;i++){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
