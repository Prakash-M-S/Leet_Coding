class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=arr.length;
       for(int i=0;i<n;i++)
       {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       int max=-1;
       for(int element:map.keySet())
       {
        if(element==map.get(element)&&element>max)
        {
            max=element;
        }
       }
       return max; 
    }
}