//happy number leetcode

class Solution {
    public boolean isHappy(int n) {
        int x=0; int sum=0;
        int count=0;
        while(n>0)
        {
            sum=0;
            while(n>0)
            {
                x=n%10;
                n=n/10;
                sum=sum+x*x;
            }
            if(sum==1) return true;
            else if(count==15) return false;
            else {
                n=sum;
                count ++;
            }
            
        }
        
        return false;
    }
}