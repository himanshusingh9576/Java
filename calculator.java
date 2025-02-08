import java.util.Scanner;

public class calculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter Operation");
        char operation = sc.next().charAt(0);
        System.out.println("The final result is:");
        switch(operation) {
            case '+':
            System.out.println(a+b);
            break; 
            case '-':
            System.out.println(a-b);
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
            System.out.println("you enter wrong input");
            break;
        } 
    }
}

