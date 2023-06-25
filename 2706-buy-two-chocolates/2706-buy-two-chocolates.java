class Solution {
    
    int findMin(int a[],int n){
        int i = 0;
        for(int j=0; j<a.length; j++){
            if(a[i] > a[j]){
                 i = j;
            }
        }
        return i;
    }
    
    public int buyChoco(int[] prices, int money) {
        
        int firstMin = findMin(prices,prices.length);
        int rem = money - prices[firstMin];
        prices[firstMin] = 101;
        int secondMin = findMin(prices,prices.length);
        
        rem -= prices[secondMin];
        
        return rem >=0 ? rem:money;
        
        
    }
}