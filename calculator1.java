import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();
            System.out.println("Enter Operation");
            char operation = sc.next().charAt(0);
            System.out.println("The Final Result is ");
            switch(operation) {
                case '+':
                System.out.println(a + b);
                break;
                case '-':
                System.out.println(a - b);
                break;
                case '*':
                System.out.println(a * b);
                break;
                case '/':
                System.out.println(a / b);
                break;
                case '%':
                System.out.println(a % b);
                break;
                default:
                System.out.println("Enter in wrong input");
                break;

            }
        }
    }
}
