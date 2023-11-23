package questions;

public class max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5,6};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,5));
    }
    static int max (int[] arr){
        int maxVal = arr[0] ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // finding max value using range

    static int maxRange (int[] arr , int start , int end){
        int maxVal = arr[start] ;
        for (int i = 0; i < end; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
