package com.kabilan;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {34, 54, 6, 2, 245, 54 , 66};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans > arr[i] ) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
