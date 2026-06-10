class Solution {
    public boolean isPalindrome(String s) {
        s=s.toUpperCase();
        int r=s.length()-1, l=0;
        while(r>l){
            if (! (Character.isLetter(s.charAt(r)) || Character.isDigit(s.charAt(r)))) {
                r--;
                continue;
            }
            if (! (Character.isLetter(s.charAt(l))|| Character.isDigit(s.charAt(l)))) {
                l++;
                continue;
            }
            if(s.charAt(r)!=s.charAt(l))
                return false;
            r--;l++;
        }
        return true;

    }
}
