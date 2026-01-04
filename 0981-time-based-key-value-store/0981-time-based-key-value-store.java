class TimeMap {
    class Pair
    {
        int t=0;
        String v=" ";
        Pair(int t, String v)
        {
            this.t=t;
            this.v=v;
        }
    }

    private int upperBound(List<Pair> l, int target) {
    int low = 0, high = l.size();
    
    while (low < high) {
        int mid = low + (high - low) / 2;

        if (l.get(mid).t > target)
        {
            high = mid;
        }
        else
            low = mid + 1;
    }
    return low;
}

Map<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }
        String ans="";
        int ind = upperBound(map.get(key),timestamp);
        if (ind == 0) {
        return "";
    }
        return map.get(key).get(ind-1).v;

        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */