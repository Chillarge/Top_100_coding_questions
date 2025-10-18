package Top_100_coding_questions;
//Check where an array is sorted or not.
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true ; // true means sorted
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]) {
                flag = false; // false means unsorted
            }
        }
        if(flag == true) {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Un-Sorted");
        }
    }
}
