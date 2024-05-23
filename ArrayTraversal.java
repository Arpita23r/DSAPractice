import java.util.*;
public class ArrayTraversal{
  public static void main(String []args) {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array elements:");
    for(int i = 0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("array elements are:");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " , " );
    }
  }        
}
  
