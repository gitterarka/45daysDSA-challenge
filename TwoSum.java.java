import java.util.HashMap;
import java.util.Map;

public class Solution {

    // Method to find two indices such that their values add up to the target
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the value and its index
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numToIndex.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Add the current number and its index to the map
            numToIndex.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the twoSum method
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the numbers that add up to the target:");
        printArray(result); // Expected output: [0, 1]
    }
}
