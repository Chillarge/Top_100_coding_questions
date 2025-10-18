package Top_100_coding_questions;

import java.util.Scanner;

//Find the dublet in an array whose sum is equal to the target.
public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + arr[j]);
                }
            }
        }
    }
}
