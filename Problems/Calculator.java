package questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;

        //get input from user until user enter "X" or "x'

        while(true){
            //take the operator as input

            System.out.print("Enter the operation(eg : +,-..etc) : ");
            char op =in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op  == '%'){

                //get to numbers
                System.out.print("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if( op == '+' ){
                    ans =num1 + num2;
                }

                if( op == '-' ){
                    ans =num1 - num2;
                }

                if( op == '*' ){
                    ans =num1 + num2;
                }

                if( op == '/' ){
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                if( op == '%' ){
                    if (num2 != 0) {
                        ans = num1 % num2;
                    }
                }

            } else if ( op == 'x' || op == 'X' ){
                System.out.println("you stopped the program");
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}
