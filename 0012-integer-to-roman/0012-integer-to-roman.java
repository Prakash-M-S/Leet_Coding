class Solution {
    public String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        int n=values.length;
        for(int i=0;i<n;i++)
        {
            int q=num/values[i];
            num=num%values[i];
            for(int j=0;j<q;j++)
            {
                sb.append(roman[i]);
            }
        }
        return sb.toString();

    }
}