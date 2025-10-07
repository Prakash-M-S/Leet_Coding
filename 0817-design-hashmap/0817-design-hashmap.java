class MyHashMap {
    class Node
{
    int data;
    int key;
    Node next = null;
    Node(int key,int data){
        this.data=data;
        this.key=key;
    }

}
    static Node[] bucket; 
    static int bsize=1000;
    public MyHashMap() {
        bucket = new Node[bsize];
    }
    public int hash(int key)
    {
return key%bsize;
    }
    public Node find(int key,Node hash)
    {
Node temp=hash;
Node curr=hash.next;
while(curr!=null&&curr.key!=key)
{
    curr=curr.next;
    temp=temp.next;
}
return temp;
    }
    public void put(int key, int value) {
        int ind=hash(key);
        if(bucket[ind]==null)
        {
            bucket[ind]=new Node(-1,-1);
        }
        Node prev=find(key,bucket[ind]);
        if(prev.next==null)
        {
            prev.next=new Node(key,value);
        }
        else
        {
            prev.next.data=value;
        }

    }
    
    public int get(int key) {
        int ind=hash(key);
        if(bucket[ind]==null)
        {
            return -1;
        }
        Node prev=find(key,bucket[ind]);
        if(prev.next==null)
        {
            return -1;
        }
        else
        {
            return prev.next.data;
        }

    }
    
    public void remove(int key) {
        int ind=hash(key);
        if(bucket[ind]==null)
        {
            return;
        }
        Node prev=find(key,bucket[ind]);
        if(prev.next==null)
        {
            return;
        }
        else
        {
            prev.next=prev.next.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */