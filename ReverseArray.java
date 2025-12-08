import java.util.Scanner;
//reverse the elements of the array
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Reverse order of the array");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
    
}
