class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String ,List<String>> m1 = new HashMap<>();
        for(String s : strs){
            char[] chararray = s.toCharArray();
            int[] count = new int[26];
            for(char s1 : chararray){
                count[s1-'a']++ ;
            }
            String name = Arrays.toString(count);
            m1.putIfAbsent(name,new ArrayList<>());
            m1.get(name).add(s);

        }

        return new ArrayList<>(m1.values());
    }
}
