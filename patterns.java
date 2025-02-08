import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Print the pattern1
        //     System.out.println("Enter the value of coloumn");
        //     int m = sc.nextInt();
        //     System.out.println("Enter the value of row");
        //     int n = sc.nextInt();
        //     System.out.println("Here your pattern is delivered.......");
        //     for(int i = 1; i <= m; i++) {
        //         for(int j = 1; j<=n; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
            // }
        // }

        //Now second pattern of hollow rectangle
        System.out.println("Enter your row");
        int a = sc.nextInt();
        System.out.println("Enter your column");
        int b = sc.nextInt();

        //outer loop
        System.out.println("Here Your pattern is delivered.....");
        for (int i=1; i<=a; i++) {
            //inner loop
            for(int j=1; j<=b; j++) {
                if( i==a || j==b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    
        //Half pyramid problem - 2
        System.out.println("Enter your number");
        int m = sc.nextInt();
        for(int i=1; i<=m; i++) {
        //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Half pyramid problem 3
        System.out.println("Enter your pattern number");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

       
