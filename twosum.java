//Question - https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=target;
        int k=0; 
        int l=0;
        for(int i=0;i<nums.length-1;i++)
        
        {
            for(int j=i+1;j<=nums.length-1;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    k=i; l=j;
                    break;
                }
                     
            }
        }
        int a[]=new int[]{k,l};
        
        return a;
        
    }
}
