package com.kabilan;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // General way
        arr[0] = 20;
        arr[1] = 223;
        arr[2] = 2320;
        arr[3] = 45;
        arr[4] = 60;

       // System.out.println(arr[2]);

      /*  //input using for loop
        while (true) {                           //used while for continuous output

            for (int i=0; i< arr.length;i++){
                arr[i] =in.nextInt();
            }

            for (int j : arr) {
                System.out.print(j + " ");
            }
        }

       */

//        for (int i=0; i< arr.length;i++){
//            arr[i] =in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));


        //input as string

        String[] str =new String[4];
        for (int i=0; i< str.length;i++ ){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
