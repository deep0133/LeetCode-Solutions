class Solution {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        int f_diff = a[1] - a[0];
        for(int i=2;i<a.length;i++){
            if(f_diff == a[i] - a[i-1]) continue;
            return false;
        }
        return true;
    }
}