public class Solution {

    public int[] productExceptSelf(int[] nums) {
        // Array to store all left multiplication
        int[] left = new int[nums.length];

        // Array to store all right multiplication
        int[] right = new int[nums.length];

        // Initialize the first element of the left array to 1
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Initialize the last element of the right array to 1
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Array to store the final answer
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
