class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a[] = new int[nums.length];
        int even = 0,odd = nums.length-1;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0) a[even++] = nums[i];
            else a[odd--] = nums[i];
        }
        
        return a;
    }
}