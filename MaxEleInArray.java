import java.util.Arrays;

public class MaxEleInArray {
    public static void main(String[] args) {
        int[][] arr={{12,43,56},{45,67,89,69},{34,98,154}};
        int target=67;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }
    static int[] search(int[][] arr,int target)
    {
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target){
                    return  new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int min(int[][] arr)
    {
        int min=Integer.MIN_VALUE;
        for(int[] row:arr)
        
         {   for(int col:row)
            {
                
                if(col<min){
                min=col;
                
            }
        }
     
    }
   
    return min;
}
}
