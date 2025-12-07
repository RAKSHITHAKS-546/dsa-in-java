import java.util.Scanner;
//to find the second largest number in an array
public class LargestSecondEle {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

//Calculate the maximum value

        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }

//calculate the second maximum value
for(int i=0;i<n;i++){
    if(arr[i]>smax && arr[i]!=max) smax=arr[i];
}
System.out.println(max);
System.out.println(smax);

    }
    
}
