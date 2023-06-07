class Solution {
    public int minFlips(int a, int b, int c) {
        int n = 64;
        int count = 0;
        while(n-->0){
            int bit_c = c&1;
            int bit_a = a&1;
            int bit_b = b&1;
            
            if(bit_c == 1){
                if(bit_a == 0 && bit_b == 0 ) count++;
            }
            else{
                if(bit_a == 1) count++;
                if(bit_b == 1) count++;
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return count;
    }
}