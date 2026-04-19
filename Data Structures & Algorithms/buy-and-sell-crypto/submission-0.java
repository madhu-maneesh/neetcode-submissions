class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            max=Math.max(max,Math.abs(bp-prices[i]));
        }
        return max;
    }
}
