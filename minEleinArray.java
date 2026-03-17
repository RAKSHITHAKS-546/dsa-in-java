package LinearSearch;

public class minEleinArray {
    public static void main(String[] args) {
        int[] arr = {18,2,3,4,5,6,-7,8,9};

        System.out.println(min(arr));
    }

    static int min(int[] arr) {

        if(arr.length == 0){
            return -1;   // important check
        }

        int ans = arr[0];

        for(int index = 1; index < arr.length; index++) {
            if(arr[index] < ans) {
                ans = arr[index];
            }
        }
        return ans;
    }
}