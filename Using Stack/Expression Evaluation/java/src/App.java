public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ExpressionEvaluation evaluation =  new ExpressionEvaluation();
        evaluation.execute("(1*2)+(2/2)");
    }
}
