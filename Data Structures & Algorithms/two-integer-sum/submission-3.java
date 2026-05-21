class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    HashMap <Integer,Integer> m1 = new HashMap<>();
    for(int i= 0 ; i < nums.length ; i++){
        int d = target - nums[i];
        if(m1.containsKey(d)){
            return new int[]{ m1.get(d),i};
        }
        m1.put(nums[i] ,i);
    }
      return new int[]{}; 
    }
}
