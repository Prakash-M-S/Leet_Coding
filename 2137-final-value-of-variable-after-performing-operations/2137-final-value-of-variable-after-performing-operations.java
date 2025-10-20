class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int add=0;
        int sub=0;
        for(String s:operations)
        {
            if(s.charAt(1)=='+')
            {
                add++;
            }
            else
            {
                sub++;
            }
        }
        return add-sub;
    }
}