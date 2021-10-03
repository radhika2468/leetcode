//QOUESTION- https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
       long  l=0;
        long r=x/2;
        if(x==0) return 0;
        if(x<4) return 1;
        long mid=0;
        while(l<=r)
        { 
            mid=(l+r)/2;
            if(mid*mid==x)  
                return (int)mid;
            if(mid*mid<x) 
            {
                if((mid+1)*(mid+1)>x)
                {
                    return (int)mid;
                }     
                l=mid+1;  
            }
             if(mid*mid>x)
             {
                 if((mid-1)*(mid-1)<x)
                 {
                     return (int)mid-1;
                  }
                r=mid-1;
              }
           }
        return 0;
        }   
    }
