package com.lc.dp;

public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int res = hr.rob(new int[]{2,7,9,3,1});
        System.out.println(res);
    }
    public int rob(int[] nums) {
        int len = nums.length;
        int res = 0;
        if(len==1)
            return nums[0];
        else if (len==2) {
            return Math.max(nums[0],nums[1]);
        }
        else{
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
            for(int i=2; i<nums.length; i++){
                dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
            }
            return dp[nums.length-1];
        }
    }
}
