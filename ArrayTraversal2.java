import java.util.*;

public class ArrayTraversal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("enter the array elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Array elements are:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
