package com.kabilan;

public class Main {
    public static void main(String[] args) {
        int[]  arr ={34,24,464,876,-424,425,65,646,56};
        int target= 59;
        int ans =linearSearch(arr,target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    //otherwise return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }
        //run a for loop
        for (int i = 0; i< arr.length; i++){
            //check for element at every index of an array
            int element=arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}