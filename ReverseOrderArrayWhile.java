import java.util.Scanner;

public class ReverseOrderArrayWhile {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of arrray:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr)
        System.out.println(ele+" ");

    }
    
}
