class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        
        while (l1 >= 0 || l2 >= 0 || c == 1) {
            char ch1 = l1 >= 0 ? a.charAt(l1) : '0';
            char ch2 = l2 >= 0 ? b.charAt(l2) : '0';
            
            if (ch1 == '1' && ch2 == '1') {
                sb.append(c);
                c = 1;
            } else if (ch1 == '0' && ch2 == '0') {
                sb.append(c);
                c = 0;
            } else {
                sb.append(c == 0 ? 1 : 0);
            }
            
            l1--;
            l2--;
        }
        
        return sb.reverse().toString();
    }
}