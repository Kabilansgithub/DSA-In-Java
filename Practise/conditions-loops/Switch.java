import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String car = in.next();

//        switch(car){
//            case "BMW" :
//                System.out.println("BMW is a luxury car");
//                break;
//            case "Tata" :
//                System.out.println("Tata is budget friendly car");
//                break;
//            case "Rolls Royce":
//                System.out.println("Rolls Royce is hand-made car");
//                break;
//            default:
//                System.out.println("Invalid input car");
//        }

        //this is the enhanced version of switch statements

//        switch (car) {
//            case "BMW" -> System.out.println("BMW is a luxury car");
//            case "Tata" -> System.out.println("Tata is budget friendly car");
//            case "Rolls Royce" -> System.out.println("Rolls Royce is hand-made car");
//            default -> System.out.println("Invalid input car");

        /*
        nested switch statements
         */

        int empID =  in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("kabilan S");
                break;
            case 2:
                System.out.println("Kevin");
                break;
            case 3:
                System.out.println("emp no 3");
                switch(department){
                    case "CSE":
                        System.out.println("CSE department ");
                        break;
                    case "IT":
                        System.out.println("IT department");
                    break;
                }
            break;
          }
    }
}