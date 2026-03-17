// import java.util.Arrays;

// //package LinearSearch;

// public class SearchIn2DArray {
//     public static void main(String[] args) {
//         int[][] arr={{23,45,67},{65,-34,43,34},{10,13,-36,90}
//         };
//         int target=90;
//         int[] ans=search(arr,target);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] search(int[][] arr,int target)
//     {
//         for(int r=0;r<arr.length;r++)
//         {
//             for(int c=0;c<arr[r].length;c++)
//             {if(arr[r][c]==target){
//                 return new int[]{r,c};
//             }

//             }
//         }

    
//     return new int[]{-1,-1};
//     }
// }
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {23, 45, 67},
                {65, -34, 43, 34},
                {10, 13, -36, 90}
        };

        int target = 90;

        int[] ans = search(arr, target);

        System.out.println("Position of target: " + Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {

        // Check if array is empty
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }

        // Traverse rows
        for (int r = 0; r < arr.length; r++) {

            // Traverse columns
            for (int c = 0; c < arr[r].length; c++) {

                if (arr[r][c] == target) {
                    return new int[]{r, c};
                }
            }
        }

        // If element not found
        return new int[]{-1, -1};
    }
}