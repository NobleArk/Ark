import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //System.out.println(" You have just run Main class!");    
        // Comment?
        //String.format("Shirt size: %s, Qty: %d", "M", 5);
        //StringBuilder sb = new StringBuilder("Welcome");
        //sb.append(" to this new thing I'm doing!");
        //String result = sb.toString();   
        //System.out.println(sb);
        //int num = 13;
        //int remainder = num % 3;
        //System.out.println(remainder);

        //StringBuilder b = new StringBuilder();
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter Value 1: ");
        
        //String input1 = scanner.nextLine();
        // b.append(input1);
        //System.out.print("Enter Value 2: ");
        //String input2 = scanner.nextLine();
        // b.append(input2);

        //b.append(input1)
        //        .append(", ")
        //        .append(input2);

        //System.out.println(b);

    //     String s1 = "Hello!";
    //     String s2 = "Hello!";

    //     if (s1 == s2) {
    //         System.out.println("Match!");
    //     } else {
    //         System.out.println("They Don't match");
    //     }

    //     String s3 = new String("Hello!");
    //     String s4 = new String("HELLO!");
    //     if (s3 == s4) {
    //         System.out.println("Match!");
    //     } else {
    //         System.out.println("They Don't match");
    //     }

    //     if (s3.equalsIgnoreCase(s4)) {
    //         System.out.println("Match!");
    //     } else {
    //         System.out.println("They Don't match");
    //     }

        System.out.println("Don't forget to close your tags with a ';'");
        // Challenge: Create a Calculator 
        // user inputs two values
        // then selects the operation (+ - / *)
        // then the calculator calculates accurately
        // use doubles
        // use custom methods
        // use a switch statement

        // collect two inputs
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please input a number: ");
            String input1 = scanner.nextLine();
            if (input1.length() == 0) {
                break;
            }
            System.out.print("Please input a number: ");
            String input2 = scanner.nextLine();
            if (input2.length() == 0) {
                break;
            }
            System.out.print("Please select an operation (+ - * /): ");
            String input3 = scanner.nextLine();
            if (input3.length() == 0) {
                break;
            }
            
        }
        // collect operand

        // setup a switch statement for which operand is inputted



    }
}