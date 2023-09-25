class Solution {
    public char findTheDifference(String s, String t) {
        
        int i = 0,n = s.length(),m = t.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        while( i<n){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            i++;
        }
        
          for ( i = 0; i < m; i++) {
            char charT = t.charAt(i);
            if (map.containsKey(charT) && map.get(charT) > 0) {
                map.put(charT, map.get(charT) - 1);
            } else {
                // charT is not in s or it has already been used up
                return charT;
            }
        }
        return 'a';
    }
}