import java.util.Scanner;

public class changeEleoFarray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter"+n+"elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
             System.out.println("Before change arr[2] = " + arr[2]);
        change(arr);
        System.out.println("After change arr[2] = " + arr[2]);
    }

    public static void change(int[] arr) {
        arr[2] = 33;
    }
}
