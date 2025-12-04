import java.util.Scanner;

public class arrayinputt {

    public static void main(String[] args) {
        
        System.out.println("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter"+n+"element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }


    }
}