public class Rotedarray {

    // Function to rotate array by d positions
    static void rotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Function to reverse elements in the array
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Main function to test the code
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 4;

        rotate(arr, d);

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
