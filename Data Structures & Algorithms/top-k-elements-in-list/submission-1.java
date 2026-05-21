class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        int[] arr = new int[nums.length];
        int k1=0 ;
        for(int i : nums){
            m1.put(i,m1.getOrDefault(i,0)+1);
            
        }
        List<Integer> l1 = new ArrayList<>(m1.keySet());

        l1.sort((a,b)->m1.get(b)-m1.get(a));
        int[] res = new int[k];
        for(int i= 0 ; i < k ; i++){
            res[i] = l1.get(i) ;
        }
        return res ;

    }
}
