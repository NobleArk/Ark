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

        String s1 = "Hello!";
        String s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("Match!");
        } else {
            System.out.println("They Don't match");
        }

        String s3 = new String("Hello!");
        String s4 = new String("HELLO!");
        if (s3 == s4) {
            System.out.println("Match!");
        } else {
            System.out.println("They Don't match");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("Match!");
        } else {
            System.out.println("They Don't match");
        }

    }

}