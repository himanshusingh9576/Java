import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        //For Loop
        // System.out.println("Enter your For Loop input:- ");
        // int num = sc.nextInt();
        // for(int i=0; i<=num; i++){
        //     System.out.println(i);
            
        // }   
                   

        //while loop
        // System.out.println("Enter your second input for while loop");
        // int num1 = sc.nextInt();
        // while(num1<=5) {
        //     System.out.println(num1);
        //     num1++;
        // }
        // System.out.println("Finish");
        // while(true) {
        //     System.out.println("Not Finish");
   
        
        // }
    



        //2n = Even Number = 0,2,4,6,8
        //2n+1 = odd Number = 1,3,5,7,9
        // System.out.println("Enter User Input:-  ");
        // int x = sc.nextInt();
        // for(int i=x;i<10; i++) {
        //     System.out.println(i);
        // }
        // System.out.println("Enter user Input");
        // int ev = sc.nextInt();
        // System.out.println("Even numbers from 1 to " +21+ " are:");
        // for(int i=ev; i<21; i++ ) {
        //     if(i%2==0) {
        //         System.out.println(i + " ");
        //     }
            
        // }
        // for(int i=5; i>0; i--) {
        //     System.out.println(i);
        // }

        //Q write a program to print first n natural number in reverse order
        // System.out.println("Enter User Input:- ");
        // int rev = sc.nextInt();
        // for(int i=100; i>rev; i-- ) {
        //     System.out.println(i);
        // }

        // uses of break;
        // for(int i=0; i<5; i++) {
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i==2) {
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }

        //In while loop using of break

        // System.out.println("Enter Your Input:-  ");
        // int i = sc.nextInt();
        // while(i<5) {
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     i++;
        //     if(i==2) {
        //         System.out.println("Ending the loop");
        //         // break;
        //     }
           
        // }
        // System.out.println("Loop ends here");

        // In do while loop use of break and continue;

        // System.out.println("Enter User Input:-  ");
        // int s = sc.nextInt();
        // do{
        //     s++;
        //     if(s==2) {
        //         System.out.println("Ending our loop");
        //         continue;
        //     }
            
        //     System.out.println(s);
        //     System.out.println("Python is also great");
            
          
        // }while(s<=5);
        // System.out.println("Loops end here");


        //Contitnue statement:- This statement is used to immidietly ove to the next iteration of the loop .
        //The control is taken to the next iteration thus skipping everything below "continue" inside the loop for that iteration
        // System.out.println("Enter user Input");
        // int con = sc.nextInt();
        // for(int i=0; i<con; i++) {
        //     if(i==2){
        //         System.out.println("Red car");
        //         break;
        //     }
        //     System.out.println(i);
        //     System.out.println("Black Car");
        // }


        //Q Write a program to print the following pattern
        //****
        //*** 
        //** 
        //* 
        // System.out.println("Enter User Input");
        // int ro = sc.nextInt();
        
        // for(int i=ro; i>1; i--){
        //     for(int j=1; j<i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        //Using while loop in above question....
        // System.out.println("Enter User Input:-  ");
        // int pa = sc.nextInt();
        // int i=pa;
        // while(i>0) {
        //     for(int j = 0; j< i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     i--;
        // }
       
        

        // write a program to sum first n even numbers using while loop.
        System.out.println("Here start even number:-  ");
        int sum = sc.nextInt();
        System.out.println("Here end even number:- ");
        int eve = sc.nextInt();
        int i = 0;
        while(i<eve) {
            sum = sum + (2*i);
            i++;
        }
        System.out.println("Sum of the even number is:- ");
        System.out.println(sum);
        // System.out.println("Enter sum by user:- ");
        // int sum = sc.nextInt();
        // System.out.println("Enter user Input:-  ");
        // int eve = sc.nextInt();
        // for(int i=0; i<eve; i++) {
        //     sum = sum + (2*i);
        // }
        // System.out.println("Sum of even numbers is:  ");
        // System.out.println(sum);

        //write an program to print multiplication any table of a given program n.
        // System.out.println("Enter User Input:-  ");
        // int mul = sc.nextInt();
        // for(int i=1;i<=10; i++) {
        //     System.out.println(i*mul);
        //     System.out.println(mul +" * " + i + " = " + (mul * i));
        // }

        // Write a program to print multiplication table of 10 in reverse order..
        // System.out.println("Enter User Input:-  ");
        // int tab = sc.nextInt();
        // for(int i=10; i>=1; i--) {
        //     System.out.println(tab + " * " + i + " = " + (tab * i));
        // }

        //Write a program to find factorial of a given number using for loop...
        // System.out.println("Enter Factorial Number:- ");
        // long fac = sc.nextInt();
        // long factorial =  1;
        // for(long i=1; i<=fac; i++) {
        //     // factorial *= i;
        //     factorial = factorial*i;
        // }
        // System.out.println("Factorial of " + fac + " is: " + factorial);

        //Same above question using while loop...
        // System.out.println("Enter user Input:-  ");
        // long fac1 = sc.nextInt();
        // long factorial1 = 1;
        // long i = 1;
        // while(i<=fac1) {
        //     factorial1=i*factorial1;
        //     i++;

        // }
        // System.out.println("Factorial of " + fac1 + " is: " + factorial1);

        //Write a program to calculate the sum of the numbers occuring in the multiplication table of 8...
        // System.out.println("Enter user input:-  ");
        // int table = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=10; i++) {
        //     sum = sum + table*i;
        //     // sum += table*i;
        //     System.out.println(table + " * " + i + " = " + (table*i));
       
        // }
        // System.out.println("the sum of table  is:-  " + sum); 




    }
}

