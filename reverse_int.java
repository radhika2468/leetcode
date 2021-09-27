// Question- https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int rev=0;
        long n=0;
            while(x!=0)
            {
                rev=x%10;
                n=n*10+rev;
                x=x/10;
            }
            if (n>Integer.MAX_VALUE || n<Integer.MIN_VALUE)
              return 0;
            else
                return (int)n;
    }
    }
}