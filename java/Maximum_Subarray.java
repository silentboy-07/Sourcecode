class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArray msa = new MaxSubArray();

        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Max Subarray Sum: " + msa.maxSubArray(nums1)); // Output: 6

        int[] nums2 = { 1 };
        System.out.println("Max Subarray Sum: " + msa.maxSubArray(nums2)); // Output: 1

        int[] nums3 = { 5, 4, -1, 7, 8 };
        System.out.println("Max Subarray Sum: " + msa.maxSubArray(nums3)); // Output: 23
    }
}
