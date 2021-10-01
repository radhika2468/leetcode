//Question- https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
         int i=digits.length;
        
        //case 123
        int carry=0;
        if(digits[i-1]!=9)    
        {
            digits[i-1]=digits[i-1]+1;
            return digits;
        }
        //case 989 returns 990
        for(int j=i-1;j>=0;j--)
        {
            if(digits[i-1]==9)
            {
                digits[j]=0;
                carry=1;
            }
            else{
                digits[j]=digits[j]+carry;
                if(digits[j]>9)
                {
                    digits[j]=0;
                    carry=1;
                }
                else{ 
                    return digits;
                }
            }
            
            
        }
        int rads[]=new int[i+1];
        rads[0]=1;
           for(i=1;i<rads.length;i++)
           {
               rads[i]=0;
           }
            return rads;
       
    }
    
}
