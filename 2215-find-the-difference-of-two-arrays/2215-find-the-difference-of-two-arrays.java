class Solution {
    
    ArrayList<Integer> solve( int[] nums1,int []nums2){
        Set<Integer> st = new HashSet<>();
         for(int i=0;i<nums1.length;i++)
            st.add(nums1[i]);
        
        for(int i=0;i<nums2.length;i++)
            if(st.contains(nums2[i]))
                st.remove(nums2[i]);
        return new ArrayList<Integer>(st);
        
    }
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> rl = new ArrayList<>();
        rl.add(solve(nums1,nums2));
        rl.add(solve(nums2,nums1));
        return rl;
       
        
    }
}