package Top_100_coding_questions;

import java.util.Scanner;

//Sum of elements in an array
public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum  = sum + arr[i];
        }
        System.out.println("The sum of elements in an array are:"+sum);
    }
}
