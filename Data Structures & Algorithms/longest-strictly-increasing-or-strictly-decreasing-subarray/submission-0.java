class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int maxlen=1;
        int inclen=1;
        int declen=1;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]>nums[i]){
                inclen++;
                declen=1;
            }else if(nums[i+1]<nums[i]){
                declen++;
                inclen=1;
            }else{
                inclen=1;
                declen=1;
            }

            maxlen=Math.max(maxlen, Math.max(inclen, declen));
        }
        return maxlen;
    }
}