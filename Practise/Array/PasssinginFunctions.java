package com.kabilan;

import java.util.Arrays;

public class PasssinginFunctions {
    public static void main(String[] args) {
        int[] arr = {12,34,56,89};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change (int[] arr){
        arr[0]=99;
    }
}
