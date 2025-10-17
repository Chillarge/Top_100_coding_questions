package Top_100_coding_questions;

import java.util.Scanner;
//Find the minimum element in an array
public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element in array is :"+min);
    }
}
