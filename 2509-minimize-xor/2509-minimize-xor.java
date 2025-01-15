class Solution {
    public int count_bits(int num)
    {
        int count=0;
        while(num>0)
        {
            count+=(1&num);
            num>>=1;
        }
        return count;
    }
    public int minimizeXor(int num1, int num2) {
         int count1 = count_bits(num1);
        int count2 = count_bits(num2);
        int i = 0;
        int x = num1;

        while (count1 != count2) {
            if (count1 > count2 && (x & (1 << i)) != 0) {
                count1--;
                x ^= (1 << i); 
            } else if (count1 < count2 && (x & (1 << i)) == 0) {
                count1++;
                x |= (1 << i); 
            }
            i++;
        }
        return x;

    }
}