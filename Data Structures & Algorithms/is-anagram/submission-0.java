class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i = 0; i<n; i++){
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
            charMap.put(t.charAt(i), charMap.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(int value : charMap.values()){
            if(value != 0){
                return false;
            }
        }
        return true;


    }
}
