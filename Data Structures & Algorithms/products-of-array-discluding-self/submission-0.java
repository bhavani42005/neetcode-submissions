class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1 ;
        int z_ct = 0 ;
        int[] arr = new int[nums.length];
        for(int i : nums){
            if(i != 0){
            product = product*i ;
            }
            else{
                z_ct += 1 ;
            }
        }
        int k = 0 ;
        for(int j : nums){
            if(z_ct == 0){
            arr[k] = product/j ;
            }
            else if(z_ct == 1){
                if(j == 0){
                arr[k] = product ;
                }
                else{
                    arr[k] = 0 ;
                }
            }
            else{
                arr[k] = 0 ;
            }
            k = k+1;
        }
        return arr ;
    }
}  
