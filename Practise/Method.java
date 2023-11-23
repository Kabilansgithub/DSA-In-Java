import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

//        int ans =sum();
//        System.out.println(ans);

        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name ");
        String name =in.nextLine();
        String message =greet(name);
        System.out.println(message);

        }

        /*   syntax for method

         return_type name (){
             //body
             return statement;
         }
        */

//        static int sum(){
//
//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter number 1: ");
//            int num1 =in.nextInt();
//            System.out.print("Enter number 2: ");
//            int num2 =in.nextInt();
//            int add =num1 + num2;
//            return add;
//
//        }

          static String greet( String name){

//              System.out.print("Enter your name :"+ name);
              String greeting ="how are you " + name;
              return greeting;
          }

}