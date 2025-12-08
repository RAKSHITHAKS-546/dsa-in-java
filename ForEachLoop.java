
import java.util.Scanner;
//print the element usinf for each loop
public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("In Linear Order:");
        
        for (int ele : arr) {
            System.out.print(ele + " ");
            
           
        }
        System.out.println("");
         System.out.println("In a stright manner:");
         for (int ele : arr)
        {
             System.out.println(ele);
        }
    }
}
