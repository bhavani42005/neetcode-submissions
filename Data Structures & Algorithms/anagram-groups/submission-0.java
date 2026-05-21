class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String ,List<String>> m1 = new HashMap<>();
        for(String s : strs){
            char[] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String name = new String(chararray);
            m1.putIfAbsent(name,new ArrayList<>());
            m1.get(name).add(s);

        }

        return new ArrayList<>(m1.values());
    }
}
