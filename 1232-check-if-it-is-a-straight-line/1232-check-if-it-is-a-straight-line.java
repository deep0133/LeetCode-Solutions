class Solution {
    
    public boolean checkStraightLine(int[][] a) {
        
    if( a[1][0]-a[0][0] ==0){
        for(int i=1;i<a.length;i++){
           if(a[i][0]!=a[0][0])
               return false;
        }   
        return true;
    }
    
    double slope = ((double)a[1][1]-(double)a[0][1])/((double)a[1][0]-(double)a[0][0]);
    double c=a[0][1] - (a[0][0]*slope);
        
    for(int i=0;i<a.length;i++)
        if(a[i][1]!=slope*a[i][0]+c) return false;
    return true;
    }
}