class Solution {
    public String decodeAtIndex(String s, int k) {
        long  d = 0;
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                d = d * (x - '0');
            } else {
                d++;
            }
        }
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                d = d / (s.charAt(i) - '0');
                k %= d;
            } else {
                if (k == 0 || k == d) {
                    return String.valueOf(s.charAt(i));
                }
                d--;
            }
        }
        
        return "";
    }
}