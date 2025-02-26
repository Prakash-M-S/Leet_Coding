class Point{
    int p,s;
    Point(int p,int s)
    {
        this.p=p;
        this.s=s;
    }
}
class StockSpanner {
 Deque<Point> stack;
    public StockSpanner() {
        stack= new ArrayDeque<>();



        
    }
    
    public int next(int price) {
        int span=1;
        while(!stack.isEmpty()&&stack.peek().p<=price)
        {
            span+=stack.pop().s;
        }
        stack.push(new Point(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */