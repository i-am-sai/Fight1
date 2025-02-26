package Recursion;

public class Factorial {

    public static int factorial(int n){
        if(n==0 || n==1){  // Base case : factorial for 0 or 1 is 1
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n=0;
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }
}
