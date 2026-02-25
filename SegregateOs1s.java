import java.util.Scanner;

public class SegregateOs1s {

    // Method to segregate 0s and 1s in the array
    void segregateOs1s(int[] arr) {

        int numberOfZeros = 0;

        // Step 1: Count number of zeros in the array
        for (int ele : arr) {
            if (ele == 0) {
                numberOfZeros++;
            }
        }

        // Step 2: Place all zeros at the beginning
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }

        // Step 3: Place all ones after zeros
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create object of class
        SegregateOs1s obj = new SegregateOs1s();

        // Call the segregate method
        obj.segregateO
        s1s(arr);

        // Print the segregated array
        System.out.println("Array after segregating 0s and 1s:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
