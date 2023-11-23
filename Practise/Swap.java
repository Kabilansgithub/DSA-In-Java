import java.util.Arrays;

public class Swap {

/*
    public static void main(String[] args) {
        /*
        This program dose-not change/swap the values ,
        because  in java program scoping is important
         * /
          int a = 10;
          int b = 20;
          swap(a,b);
          System.out.println(a+" "+b);

    }
    static void swap(int a, int b){
          int temp= a ;
          a=b;
          b=temp;
      }
*/


    public static void main(String[] args) {
        // create an array
        int[] arr= {1,2,3,4,5,};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0] =50;
    }
}
