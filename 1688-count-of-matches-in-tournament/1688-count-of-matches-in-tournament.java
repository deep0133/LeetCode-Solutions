class Solution {
    public int numberOfMatches(int n) {
        
        int result = 0;
        
        while(n > 1){
            // Even Case:
            if(n%2 == 0){
                result += n/2;
            }
            else {
                result = result + (n/2) + 1;
            }
            n/=2;
        }
        
        return result;
    }
}