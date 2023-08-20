package questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //To find nth fibonacci number:
        //fibonacci series - 0,1,1,2,3,5,8.13,....

        Scanner in =new Scanner(System.in);
        int n =in.nextInt();

//        int a=0,b=1;
//        int temp;
//        int count=2;
//
//        while(count<=n){
//            temp=a+b;
//            a=b;
//            b=temp;
//            count++;
//        }
//        System.out.println(temp);

        /*
        to get fibonacci series
         */

        int a=-1,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }


    }
}