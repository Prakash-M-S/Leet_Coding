class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double avg;
        int currsum=0 , maxsum=0;
        int n = arr.length;
         for(int i = 0 ; i< k ; i++){
             currsum+=arr[i];
         }
         maxsum= currsum;
         for(int j = k ; j< n ;j++){
             currsum= currsum-arr[j-k]+arr[j];
             maxsum= Math.max(maxsum, currsum);
         }
         avg= (double)maxsum/(double)k;
        return avg;
    }
}