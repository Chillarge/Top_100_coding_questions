package Top_100_coding_questions;

import java.util.Scanner;

//Rotate the given array by K steps.
public class Question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr, 0 , n-1);
        System.out.println("The rotated array by K steps is");
        for(int z = 0;z<n;z++){
            System.out.print(arr[z] + " ");
        }

    }
    static void reverse(int arr[], int i , int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
