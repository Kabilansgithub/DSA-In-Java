package com.kabilan;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums= {24,75,74,7,746,854,7,736};
        System.out.println(findNumbers(nums));
    }

    //to find even digits in the array
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }


    //checks digit is even or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2==0){
            return true;
        }
        return false;
    }

    // tells the number/counts of digit
    static int digits(int num ){
        int count=0 ;
        while(num>0){
            count++;
            num =num/10;
        }
        return count;
    }
}