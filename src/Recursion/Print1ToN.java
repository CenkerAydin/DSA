package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n=10;
        printN(n);
    }
    static void printN(int n){
        if (n > 0){
            printN(n-1);
            System.out.print(n+ " ");
        }
        return;
    }

    //Time Complexity: O(n)
    //Auxiliary Space: O(n)

}
