public class MissingNumberExample {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // The expected length of the array including the missing number
        int totalSum = (n * (n + 1)) / 2; // The sum of all numbers from 1 to n
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8}; // Example array with a missing number
        
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }
}
