import java.util.Scanner;

public class forEachloop2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            arr[i] *=2;
        }
        for(int ele:arr)
        {
            System.out.println(ele+"");
        }



        }
    
}
