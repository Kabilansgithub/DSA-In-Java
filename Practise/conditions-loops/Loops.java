package com.kabilan;

//import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        syntax of for loops

        for(initialisation;condition;increment/decrement){
            //body
        }
         */

        //print numbers from 1-10

//        for (int num=1;num <=10;num++){
//            System.out.println(num);
//        }

        //print numbers from 1-n

//        Scanner in =new Scanner(System.in);
//        int n=in.nextInt();

//      for (int i=1;i<n;i++){
//          //System.out.println(i +" ");
//          System.out.println("Hello World");
//      }

      /*
      syntax of while loop

        while(condition){
        //body
        }
      */

//       int num=1;
//       while(num<=5){
//           System.out.println(num);
//           num+=1;
//       }


        /*
        syntax of do-while loop

        do{
        //body
        }while(condition);

         */

        int n=1;
        do {
            System.out.println(n);
            n++;
        }while(n<5);

    }
}
