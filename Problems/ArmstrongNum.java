package questions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        // Armstrong's numbers :  the number and the cubic-sum of number are same
        //example : 153 = 1^3 + 5^3 + 3^3

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        for(int i=100; i < 999 ;i++){
            if (isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;

        while(n>0){
            int rem = n % 10;
            n =n/10;
            sum =sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
