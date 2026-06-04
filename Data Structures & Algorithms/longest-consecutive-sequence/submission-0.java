class Solution {
    public int longestConsecutive(int[] nums) {
        if ( nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int curr = nums[0], i = 0, len = 0, res=0;
        while(i != nums.length){
            if(curr != nums[i]){
                curr = nums[i];
                len = 0;
            }
            while ( i != nums.length && curr == nums[i] ){
                i++;
            }
            len++;
            curr++;
            res=Math.max( res, len);
        }
        return res;
        
    }
}
