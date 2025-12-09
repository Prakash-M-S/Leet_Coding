class FreqStack {
    int max=0;
    Map<Integer,Integer> freq;
    Map<Integer,Stack<Integer>> stacks;
    public FreqStack() {
        freq=new HashMap<>();
        stacks=new HashMap<>();
    }
    
    public void push(int val) {
        freq.put(val,freq.getOrDefault(val,0)+1);
        if(max<freq.get(val))
        {
            max=freq.get(val);
        }
        if(!stacks.containsKey(freq.get(val)))
        {
            stacks.put(freq.get(val),new Stack<>());
        }
        stacks.get(freq.get(val)).push(val);
    }
    public int pop() {
        int remov=stacks.get(max).pop();
        freq.put(remov, freq.get(remov) - 1);
        if(stacks.get(max).isEmpty())
        {
            stacks.remove(max);
            max--;
        }
        return remov;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */