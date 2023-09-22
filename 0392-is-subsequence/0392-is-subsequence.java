class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        int count = 0;
        
        int i = 0,j = 0;
        
        while(i < n){
            char c = s.charAt(i);
            while(j < m && t.charAt(j) != c){
                j++;
            }
            if(j < m && t.charAt(j) == c) {
                count++;
                j++;
            }
            i++;
        }
        return count == n ;
        
    }
}