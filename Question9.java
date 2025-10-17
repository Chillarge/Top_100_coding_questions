package Top_100_coding_questions;

import java.util.Scanner;

//check for prime number between the range
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit");
        int a = sc.nextInt();
        System.out.print("Enter the Upper limit");
        int b =sc.nextInt();


        for(int i=a;i<=b;i++){
            int count =0;
            if(i>1){
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count ++;
                    }
                }
                if(count ==2){
                    System.out.print(i +" ");
                }
            }
        }
    }
}
