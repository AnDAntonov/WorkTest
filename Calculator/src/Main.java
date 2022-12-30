import java.util.Scanner;

public class Main {
    public static void calc(String input){
        ParseExpression.InputExpression(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        calc(expression);
    }
}
