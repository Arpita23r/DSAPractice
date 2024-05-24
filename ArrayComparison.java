import java.util.*;
public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n =sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i<n;i++) {
            arr[i]=sc.nextInt();
        }
        // System.out.println("Array elements are:");
        // for(int i=0; i<n; i++) {
        //     System.out.print(arr[i] + " , ");
        // }
        System.out.println("Array values upper than 5 are:");
        for(int i=0; i<n;i++) {
            if(arr[i] > 5) {
                System.out.println(arr[i] + " , ");
            }
        }
    }
}
