//QUESTION- https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0; 
        int r=nums.length-1; 
        int mid=0;
        if(nums[nums.length-1]<target) 
            return nums.length;
        if(nums[0]>target) 
            return 0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]==target) 
                return mid;
            if(nums[mid]>target) 
            {
                if(nums[mid-1]<target)
                { 
                    return mid;
                }
                r=mid-1;
            }
            else if(nums[mid]<target) 
            {
                 if(nums[mid+1]>target)
                 { 
                     return mid+1;
                 }
                l=mid+1;
            }
        }//end of while
        return 0;
    }
}