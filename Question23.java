package Top_100_coding_questions;

import java.util.Scanner;

// Find the second maximum element in an array
public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                 smax = arr[i] ;
            }
        }
        System.out.println("The second maximum element in an array is : "+smax);
    }
}
