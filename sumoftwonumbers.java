import java.util.Scanner;

public class sumoftwonumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first Number");
            int num_1 = sc.nextInt();
            System.out.println("Enter second number");
            int num_2 = sc.nextInt();
            int sum = num_1 + num_2;
            System.out.println("Sum: " + sum);
        }
    }
}
