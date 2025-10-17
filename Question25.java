package Top_100_coding_questions;
//Find the second minimum element in an array
import java.util.Scanner;

public class Question25 {
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
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smin && arr[i]!=min){
                smin = arr[i];
            }
        }
        System.out.println("The second minimum element in an array is :"+smin);
    }
}
