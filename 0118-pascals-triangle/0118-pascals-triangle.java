class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        list.add(arr);
        int p =1;
        while(p<n){

            List<Integer> sublist = list.get(p-1);
            arr = new ArrayList<Integer>();
            arr.add(1);
            
            for(int i=0;i<sublist.size()-1;i++){
                Integer val1 = sublist.get(i);
                Integer val2 = sublist.get(i+1);
                arr.add(val1+ val2);
            }
            arr.add(1);
            list.add(arr);
            p++;
        }

        return list;
    }
}