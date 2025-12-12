 import java.util.Scanner;

public class MissingElement {

    // Method to find the missing number
    static int findMissing(int[] arr) {

        // If one number is missing, total numbers = array length + 1
        int n = arr.length + 1;

        // Formula for sum of first n natural numbers: n * (n + 1) / 2
        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;

        // Calculate the sum of all elements present in the array
        for (int num : arr) {
            arraySum += num;
        }

        // Missing number = expected sum - actual sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array (one number missing):");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call method to find missing number
        int missing = findMissing(arr);

        System.out.println("The missing number is: " + missing);
    }
}
