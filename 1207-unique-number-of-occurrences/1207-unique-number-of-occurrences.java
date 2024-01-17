class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int num : arr) 
            frequency.put(num, frequency.getOrDefault(num,0)+1);

        HashSet<Integer> storage = new HashSet<>(frequency.values());

        return frequency.size() == storage.size();
    }
}