public class Main {
    public static void main(String args[]) {
        System.out.println(" You have just run Main class!");    
        // Comment?
        String.format("Shirt size: %s, Qty: %d", "M", 5);
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to this new thing i'm doing!");
        String result = sb.toString();   
        System.out.println(sb);
    }

}