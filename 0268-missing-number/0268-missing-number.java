class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]!=i){
                return i;
                }
            }
        return a[n-1]+1;
    }
}