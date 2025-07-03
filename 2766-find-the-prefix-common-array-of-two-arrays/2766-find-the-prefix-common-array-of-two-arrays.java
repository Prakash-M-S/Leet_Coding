class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int number=0;
        int n=A.length;
        int bee[]=new int[n];
        for(int i=0;i<n;i++)
        {   number=0;
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            for(int freq:map.values())
            {
                if(freq>1)
                {
                    number+=(freq-1);
                }
            }
            bee[i]=number;
        }
        return bee;
    }
}