import java.util.Scanner;
public class Associativity {
    public static void main(String[] args) {
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        // precendence and Associativity;
        // System.out.println("Enter first digit");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Digit");
        // int b = sc.nextInt();
        // int asso = a/b-a*2;
        // System.out.println(asso);

        // Data type of Expression and Increment/Decrement.
        // System.out.println("Enter Your Number");
        // int x = sc.nextInt();
        // System.out.println(x++);
        // System.out.println(x);
        // System.out.println("Enter Your Number");
        // int y = sc.nextInt();
        // System.out.println(++y);
        // System.out.println(y);
        System.out.println("Enter Your Number");
        int c = sc.nextInt();
    
        System.out.println(++c * 8);
        System.out.println(c);
        // character are also increment and Decrement
        char ch = 'a';
        System.out.println(++ch);
        
    }
}
