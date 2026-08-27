class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] chars=new int[26];
            for(char c :s.toCharArray()){
                chars[c-'a']++;
            }
            String k=Arrays.toString(chars);
            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
