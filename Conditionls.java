package com.kabilan;

public class Conditionls {
    public static void main(String[] args) {

        /*
        syntax of if statements :
        if (condition is true or false){
        //body
        }
        else{
        //body
        }
         */

//        int salary=25000;
//        int bonus=2000;
//        if(salary > 10000){
//            salary=salary+bonus;
//        }
//        else{
//            salary=salary+1000;
//        }
//        System.out.println(salary);

        //Multipe if else

        int salary=30000;
        if(salary>10000){
            salary+=2000;
        } else if (salary >20000) {
            salary += 3000;
        }else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}