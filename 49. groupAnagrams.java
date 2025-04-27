//49. 字母异位词分组
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Word,List<String>> map=new HashMap<>();
        for(String s:strs){
            Word W=new Word(s);
            if(map.containsKey(W)){
                map.get(W).add(s);

            }else{
                List<String> ss=new ArrayList<>();
                ss.add(s);
                map.put(W,ss);
            }
        }
        return new ArrayList<>(map.values());
    }
    class Word{
        int[] counts;
        public Word(String s){
            final char[] chars=s.toCharArray();
            counts=new int[26];
            for(char c:chars){
                int index=c-'a';
                counts[index]++;
            }
        }
        public boolean equals(Object o){
            return Arrays.equals(counts,((Word)o).counts);
        }
        public int hashCode(){
            return Arrays.hashCode(counts);
        }
    }


}
