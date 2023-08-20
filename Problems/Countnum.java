package questions;

public class Countnum {
    public static void main(String[] args) {

        /*
        counting occurrences
        In this problem lets count num 7
         */

        int n=77734;
        int count=0;

        while(n>0){
            int rem = n % 10; //it gives the reminder of n
            if (rem ==7){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
