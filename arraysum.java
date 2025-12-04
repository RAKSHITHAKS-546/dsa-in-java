import java.util.Scanner;

public class arraysum {
public static void main(String[] args) {
    int n=9,sum=1;
    System.out.println("Enter the array elements");
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[n];

    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        sum=sum*arr[i];
    }
    System.out.println("sum of the array:"+sum);
}
}
