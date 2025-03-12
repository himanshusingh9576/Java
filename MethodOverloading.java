import java.util.Scanner;

public class MethodOverloading{
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a) {
        System.out.println("Good Morning " + a + " bro!");
    }

    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word");
    }
    public static void main(String[] args) {
        tellJoke();
        // changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is - " + x);

        // changing the array
        int [] marks = {52,76,83,98,81,71};
        change2(marks);
        System.out.println("The value of x after running is: " + marks[0]);


        //Method Overloading:- Two or more method can have same name but diffeent parameters. Such methods are called Overloaded Methods
        foo();
        // foo(a:3000);
        

        
    }
}