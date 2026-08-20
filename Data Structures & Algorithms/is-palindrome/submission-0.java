class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        int start =0;
        int end=a.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(a.charAt(start))){
                start++;
            }
            while (start<end && !Character.isLetterOrDigit(a.charAt(end))){
                end--;
            }
            if (a.charAt(start)!=a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}