class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        int i = 0,j = 0 , n = s.length(), m = t.length();
        while(j<m){
            if(t.charAt(j) != '#') st2.push(t.charAt(j));
            else if(!st2.isEmpty()) st2.pop();
            j++;
        }

        while( i < n) {
            if(s.charAt(i) != '#') st1.push(s.charAt(i));
            else if(!st1.isEmpty()) st1.pop();
            i++;
        }

        while( !st1.isEmpty() && !st2.isEmpty()) {
            if(st1.pop() != st2.pop()) return false;
        }

        return st1.isEmpty() == st2.isEmpty();
    }
}