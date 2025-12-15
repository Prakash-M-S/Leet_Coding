class Solution{
    public int getMaxRepetitions(String s1,int n1,String s2,int n2){
        int len1=s1.length();
        int len2=s2.length();

        int[] increase=new int[len2];

        for(int i=0;i<len2;i++){
            int p1=0;
            int p2=i;
            while(p1<len1){
                if(s1.charAt(p1)==s2.charAt(p2%len2)){
                    p2++;
                }
                p1++;
            }
            increase[i]=p2-i;
        }

        int ptr=0;
        int total=0;

        for(int i=0;i<n1;i++){
            total+=increase[ptr];
            ptr+=increase[ptr];
            ptr%=len2;
        }

        return total/(len2*n2);
    }
}
