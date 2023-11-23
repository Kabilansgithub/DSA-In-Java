package com.kabilan;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,13,45,36,34,48,53,24};
        int target = 48;
        System.out.println(linearSearch(arr, target, 2,7));
    }

    static int linearSearch(int[] arr, int target , int start, int end){
        if (arr.length ==0){
            return -1;
        }
        //run a for loop
        for (int i = start; i<=end ; i++){
            //check for element from start-end index of an array
            int element=arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
