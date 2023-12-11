class Solution {
    public int findSpecialInteger(int[] arr) {
        int result = arr[0];
        int temp = 1;
        int count = 1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]) count++;
            else {
                if(count > temp) {
                    result = arr[i-1];
                    temp = count;
                }
                count = 1;
            }
        }
        
        if(count > temp) {
            result = arr[arr.length-1];
        }
        return result;
    }
}