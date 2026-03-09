package binarySearch;

public class firstocuurence {

    public static void main(String[] args) {

        int[] arr = {2,4,4,4,4,4,6,8};
        int target = 4;
        int[] ans=new int[2];
        int start = search(arr, target, true);
        int end=search(arr, target, false);
        int count =0;
        if(start!=-1)
        count=end-start+1;
        System.out.println(count);
    }

    static int search(int[] nums, int target, boolean findStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;

                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}