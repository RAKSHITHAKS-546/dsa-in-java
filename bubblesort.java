package SelectionSort.bubblesort.java;
import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,5,4,6,7,8,3};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int bubblesort(int[] arr,int first,int second)
    {
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=1;j<=arr.length-1;j++)
            {
            if(arr[i]<arr[i-1]){

        
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        
        }
    }
    
}
    }}