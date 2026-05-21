class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m1 = new HashMap<>();
        for(int i= 0 ; i < s.length() ; i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j = 0 ; j < t.length() ; j++){
            m1.put(t.charAt(j),m1.getOrDefault(t.charAt(j),0)-1);
        }
        for(int i : m1.values()){
            if(i != 0){
                return false ;
            }
        }
        return true ;
    }
}
