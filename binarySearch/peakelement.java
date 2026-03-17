package binarySearch;

public class peakelement {
    public static void main(String[] args) {
        
    int[] arr={1,2,4,5,6,4,5,2};
    int target=6;
    int ans=search(arr,target);
    System.out.println(ans);
    if(ans != -1){
            System.out.println("Element: " + arr[ans]);
        }else{
            System.out.println("Element not found");
        }
    }
    
static int search(int[] arr,int target)
{
    int start=0;
    int end=arr.length-1;
    while(start <= end){
        int mid=start+(end-start)/2;
        if(target>arr[mid]){
            start=mid+1;
        }
        else if(target<arr[mid]){
            end=mid-1;
        }
        else{
            return mid;
        }
    }
return -1;
}
}
// static int peakIndexMounatinArray(int[] arr)
// {
//     int start=0;
//     int end=arr.length-1;
//     while(start<end){
//         int mid=start+(end-start)/2;
//         if(arr[mid]<arr[mid+1]){
//             end=mid;
//         }
//         else{
//             start=mid+1;
//         }
//     }
//     return start;
// }}}