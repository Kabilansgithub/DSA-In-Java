package com.kabilan;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {457,47,427,86},
                {48,97,682,2,68},
                {95,572,82,52}
        };
        int target = 82 ;
        int[] ans = search(arr, target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        if (arr == null) {
            return new int[] {-1,-1};
        }

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
