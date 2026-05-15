class Solution {
    public int[] twoSum(int[] nums, int target) {
    // Result array to store the two indices
    int[] ans = new int[2];

    // Loop through each pair in the array
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            // Check if the sum equals the target
            if (nums[i] + nums[j] == target) {
                // Store the indices in ans and return
                return new int[]{i, j};
            }
        }
    }

    // Return [-1, -1] if no solution is found
    return new int[]{-1, -1};
}

}
