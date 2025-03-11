import java.util.Scanner;

public class MethodOverloading{
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
    
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is - " + x);

        int [] marks = {52,76,83,98,81,71};
        change2(marks);
        System.out.println("The value of x after running is: " + marks[0]);
        

        
    }
}