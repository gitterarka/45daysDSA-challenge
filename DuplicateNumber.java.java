import java.util.Scanner;

class Solution {
    public int findDuplicate(int[] nums) {
        // Floyd's Tortoise and Hare (Cycle Detection)
        int tortoise = nums[0];
        int hare = nums[0];
        
        // Phase 1: Finding the intersection point of the two runners.
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        
        // Phase 2: Finding the entrance to the cycle.
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return hare;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The duplicate number is: " + ob.findDuplicate(arr));
    }
}