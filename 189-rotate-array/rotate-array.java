class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int arr[] = nums.clone();

        for(int i = (n - k), j = 0; j < n; i++, j++)
            nums[j] = arr[i%n];

    }
}