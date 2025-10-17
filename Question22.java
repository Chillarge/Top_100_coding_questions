package Top_100_coding_questions;

import java.util.Scanner;

// Find the maximum element in an array
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int len = arr.length;
        int max = arr[0];
        for(int i=0;i<len;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("The maximum element in an array is :"+max);
    }
}
