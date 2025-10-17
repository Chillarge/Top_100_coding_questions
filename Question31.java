package Top_100_coding_questions;

import java.util.Scanner;

//count of elements at odd index in an array
public class Question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                count++;
            }
        }
        System.out.print("The count of elements at odd index are:" + count);
    }
}
