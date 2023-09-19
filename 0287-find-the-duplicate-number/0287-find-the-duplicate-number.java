class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int size = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(size == set.size()) return nums[i];
            size++;
        }
        return nums[0];
    }
}