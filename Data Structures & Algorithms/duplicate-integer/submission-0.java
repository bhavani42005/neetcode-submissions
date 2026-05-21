class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        boolean flag = false ;
        for(int i= 0 ; i < nums.length ; i++){
            m1.put(nums[i],m1.getOrDefault(nums[i],0)+1);
            if(m1.get(nums[i]) > 1){
                flag = true ;
                break ;
            }
        }
    return flag ;
    }
}