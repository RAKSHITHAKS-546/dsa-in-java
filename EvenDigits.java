public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 6, 7, 7896};
        System.out.println(findnumber(nums));
        System.out.println(digits(54637));
    }

     static boolean even(int num) {
        int numberofDigits = digits(num);
        return numberofDigits % 2 == 0;   // return inside method
    }

    static int findnumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {   // pass single number, not array
                count++;
            }
        }
        return count;   // return count (not count++)
    }

   
    static int digits(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;   // missing return statement
    }
}