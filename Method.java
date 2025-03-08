import java.util.Scanner;

public class Method {
    static int logic(int x, int y){     //static method
        int z;
        if(x>y){
            z = x+y;
        }else {
            z = (x + y) * 5;
        }
        return z;
        
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        System.out.println(c);
        // if(a>b) {
        //     c=a+b;
        // }else {
        //     c=(a+b)*5;
        
        // } 
        int a1 = 5;
        int b1 = 6;
        int c1;
        c1 = logic(a1,b1);
        // if(a1>b1) {
        //     c1=a1+b1;
        // }else {
        //     c1=(a1+b1)*5;
            System.out.println(c1);
        // }

    }
}