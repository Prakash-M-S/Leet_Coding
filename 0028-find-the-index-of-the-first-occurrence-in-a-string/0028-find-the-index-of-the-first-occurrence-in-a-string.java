class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
if (n == 0) {
    return -1;
}

int lps[] = new int[n];
int p = 0;
int i = 1;

while (i < n) {
    if (needle.charAt(p) == needle.charAt(i)) {
        p = p + 1;
        lps[i] = p;
        i = i + 1;
    } else if (p == 0) {
        lps[i] = 0;
        i = i + 1;
    } else {
        p = lps[p - 1];
    }
}

i = 0;
int j = 0;

while (i < haystack.length()) {
    if (haystack.charAt(i) == needle.charAt(j)) {
        i++;
        j++;
    } else if (j == 0) {
        i++;
    } else {
        j = lps[j - 1];
    }

    if (j == n) {
        return i - n;
    }
}

return -1;
    
        
        
    }
}