package Top_100_coding_questions;

import java.util.Scanner;

//Products of element in an array
public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for(int i=0;i<n;i++){
            product = product * arr[i];
        }
        System.out.println("The product of elements of an array are : "+ product);
    }
}
