class Solution {
    public int minOperations(String s) {
        int op_with_one = 0;
        int op_with_zero = 0;
        
        for(int i=0;i<s.length();i++){
            if( i%2 == 0 ){   // Even Index
                if(s.charAt(i) =='0') op_with_one++;
                else op_with_zero++;
            }
            else {           // Odd Index
                if(s.charAt(i) =='1') op_with_one++;
                else op_with_zero++;
            }
        }
        return Math.min(op_with_one,op_with_zero);
    }
}