class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int lp=1;
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            lp*=nums[i-1];
            res[i]=lp;
        }

        int rp=1;
        // res[nums.length-1]*=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rp*=nums[i+1];
            res[i]*=rp;
        }
        return res;
    }
}  
