class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int rowSum[] = new int[n];
        int colSum[] = new int[m];

        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }
        
        int ans[][] = new int[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
               ans[i][j] = rowSum[i] + colSum[j] - (grid[i].length - rowSum[i])  - (grid.length - colSum[j]);
            }
        }

        return ans;
    }
}