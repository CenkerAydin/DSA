package Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(3)); //2
        System.out.println(fibo(7)); //13
    }

    static int fibo(int n){
        if (n < 2) return n; //Base condition

        return fibo(n-1)+fibo(n-2);
    }
}
