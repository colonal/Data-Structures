import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World");
        Scanner scanner = new Scanner(System.in);

        BalancedParentheses balancedParentheses =  new BalancedParentheses();
        System.out.print("Enter an expression: ");
        String data =  scanner.nextLine();
        boolean chack =  balancedParentheses.areBalanced(data);
        System.out.println(chack?"Balanced":"Not Balanced");
        scanner.close();
    }
}
