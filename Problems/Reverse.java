package questions;

public class Reverse {
    public static void main(String[] args) {

        /*
        Reversing the integers
        eg: int=12345 then o/p = 54321
         */

        int num = 12345;
        int ans = 0;

        while(num>0){
            int rem = num % 10;  // 5 is the reminder for 12345 % 10

            num /= 10;  // it gives 1234  fir 12345 / 10

            ans =ans*10 +rem;  //reminder is added to previous ans  
        }
        System.out.println(ans);
    }
}
