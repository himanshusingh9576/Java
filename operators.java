import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Arithmetic operator
            System.out.println("Enter first Number");
            int a =sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();
            b += 3; // it means add 3 in exist value of b..
            System.out.println("Answer is");
            int c = a % b;
            System.out.println(c);
        }
        // Comparison Operator -> ==,>=,<= basically ye btata hai ki true or false hai 
        System.out.println("its true or false:-");
        
        System.out.println(6>=2);
        System.out.println(6<=2);
        //Logical Operator  ->  &&, ||, !
        System.out.println(6>2 && 5<2); //its and operator
        System.out.println(5>2); //its or operator
        
        // Bitwise Operators -> &,!
        System.out.println(2&3);

    }
}
