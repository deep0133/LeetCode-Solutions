class Solution {
    
    String concatenate(String s[]){
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ;i<s.length;i++)
            str.append(s[i]);
        
        return str.toString();
    }
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concatenate(word1).equals(concatenate(word2));
    }
}