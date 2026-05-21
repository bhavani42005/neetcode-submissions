class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        int[] arr = new int[nums.length];
        int k1=0 ;
        for(int i : nums){
            m1.put(i,m1.getOrDefault(i,0)+1);
            
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1] ;
        for(int num : m1.keySet()){
            int freq = m1.get(num);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
            
        
        }
        int[] res = new int[k];
        int index = 0 ;
        for(int i=bucket.length-1 ; i > 0 && index < k ; i--){
            if(bucket[i] != null){
            for(int n : bucket[i]){
                res[index++] = n ;
                if(index == k){
                    break;
                }
            }
        }
        }
        return res ;

    }
}
