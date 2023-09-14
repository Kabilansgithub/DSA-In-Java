package com.kabilan;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[][] arr ={
//                {12,123,312},
//                {123,6767,4653}
//        };
//
//        System.out.println(arr[1][2]);

        //input for 2D array

        int[][] arr =new int[3][3];
        System.out.println(arr.length);

        for (int i=0 ; i < arr.length ;i++){  // i is row
            for ( int j =0 ; j < arr[i].length; j++) {     // j is column
                arr[i][j] = in.nextInt();
            }
        }

        //output
//        for (int i=0 ; i < arr.length ;i++){  // i is row
//            for ( int j =0 ; j < arr[i].length; j++) {     // j is column
//                System.out.print(arr[i][j] +" ");
//            }
//            System.out.println();
//        }

        //or use Arrays.tostring

        for (int i=0 ; i < arr.length ;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
