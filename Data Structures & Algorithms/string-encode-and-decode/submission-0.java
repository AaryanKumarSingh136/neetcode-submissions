class Solution {

    public String encode(List<String> strs) {
        StringBuilder a=new StringBuilder();
        for(String s : strs){
            a.append(s.length()).append('#').append(s);
        }
        return a.toString();
    }

    public List<String> decode(String str) {
        List<String> b=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;
            b.add(str.substring(i,j));
            i=j;
        }
        return b;
    }
}
