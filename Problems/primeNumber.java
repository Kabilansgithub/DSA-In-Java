package questions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        // the number is prime or not

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num +" is prime or not");
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        int a = 2;
        while( a*a <=num){
            if(num%a==0){
                return false;
            }
            a++;
        }

        if(a*a>num){
            return true;
        }
        return false;
    }
}
