class Solution {
    public int[][] transpose(int[][] a) {
        int b[][]=new int[a[0].length][a.length];
        int k=0;
        
        for(int i=0;i<a[0].length;i++){
            int t=0;
            for(int j=0;j<a.length;j++){
                b[k][t++]=a[j][i];
            }
            k++;
        }
        return b;
    }
}