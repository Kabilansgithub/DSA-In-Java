package com.kabilan;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,3,4,5},
                {34,563,234,254},
                {34,64,65,34}
        };
        System.out.println(maximumWealth(accounts));
    }

    // to find max wealth of people by calculating their bank accounts of each person
    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        // person is row
        // account is col
        for (int person = 0; person < accounts.length; person++) {    // people who own multiple account

            // when you start a new col , take a new sum
            int sum = 0;
            for (int banks = 0; banks < accounts[person].length; banks++) {  // bank banks  of each person
                sum += accounts[person][banks];
            }

            // now we have sum of accounts of each person
            //check with overall ans
            if (sum > ans) {
                ans = sum ;
            }
        }
        return ans ;
    }
}
