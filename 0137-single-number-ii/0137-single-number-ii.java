class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map =new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the element with only one occurrence
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        return -1;
    }
}