//question: https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        String lo=s.trim();
        int k=lo.length()-1;
        int l=lo.lastIndexOf(' ');
        return k-l;
    }
}