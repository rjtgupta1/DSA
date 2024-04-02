import java.util.*;
public class Recursion {
    //1. Program to find n!

    static int Factorial(int n){
        int factorial=1;
        if(n==0){
            return 1;
        }
        factorial = Factorial(n-1)*n;
        return factorial;
        
    }

    public static void main(String args[]){
        System.out.print("Enter a number to find factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
}
