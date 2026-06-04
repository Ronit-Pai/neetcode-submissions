class Solution {
    public int binarySearch(int l, int r, int[] nums, int key) {
        if (l > r) 
            return -1;

        int mid = l + (r - l) / 2;

        if (nums[mid] == key) 
            return mid;

        return (nums[mid] < key) ?
            binarySearch(mid + 1, r, nums, key) :
            binarySearch(l, mid - 1, nums, key);
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
}