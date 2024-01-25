package Recursion;

public class MeanOfArray {

    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        System.out.println(findMean(arr, arr.length));
    }

    static float findMean(int A[], int n){
        if (n==1) return  (float) A[n-1];
        else return (float) (findMean(A,n-1)*(n-1) +A[n-1]) / n;
    }
}
