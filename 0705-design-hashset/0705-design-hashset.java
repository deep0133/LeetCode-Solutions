class MyHashSet {
    int[] a;

    public MyHashSet() {
        a = new int[(int) Math.pow(10, 6) +1];
        
    }
    
    public void add(int key) {
        a[key] = 1;
    }
    
    public void remove(int key) {
        a[key] = 0;
    }
    
    public boolean contains(int key) {
        return a[key] == 0 ?false:true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */