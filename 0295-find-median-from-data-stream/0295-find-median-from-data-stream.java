class MedianFinder {
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    public MedianFinder() {
        this.maxHeap=maxHeap;
        this.minHeap=minHeap;
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==minHeap.size())
        {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        else
        {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        double avg=0.0;
        if(minHeap.size()==maxHeap.size())
        {
            avg=(minHeap.peek()+maxHeap.peek())/2.0;
        }
        else
        {
            avg=maxHeap.peek();
        }
        return avg;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */