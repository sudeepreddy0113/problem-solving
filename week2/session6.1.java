class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Step 1: Pack both x_i and y_i into the second half of nums
        for (int i = 0; i < n; i++) {
            nums[i + n] = (nums[i] << 10) | nums[i + n];
        }

        // Step 2: Extract values back in interleaved order
        int index = 0;
        for (int i = n; i < 2 * n; i++) {
            int x = nums[i] >> 10;
            int y = nums[i] & 1023; // 1023 is 2^10 - 1 (mask for lower 10 bits)

            nums[index++] = x;
            nums[index++] = y;
        }

        return nums;
    }
}