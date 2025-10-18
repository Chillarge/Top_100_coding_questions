package Top_100_coding_questions;
//Reverse an array.
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i =0, j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++ ;
            j--;
        }
        System.out.println("The reversed array is:");
        for(int z=0;z<n;z++){
            System.out.print(arr[z] + " ");
        }
    }
}
