class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] netShifts = new int[n + 1];
        for (int[] shift : shifts) {
            netShifts[shift[0]] += shift[2] == 1 ? 1 : -1;
            netShifts[shift[1] + 1] -= shift[2] == 1 ? 1 : -1;
        }
        int currentShift = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            currentShift = (currentShift + netShifts[i]) % 26;
            result.append((char) ((s.charAt(i) - 'a' + (currentShift + 26) % 26) % 26 + 'a'));
        }
        return result.toString();
    }
}