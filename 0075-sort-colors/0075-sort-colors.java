class Solution {
    public void sortColors(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){ 
            
           
                if(i + 1 < nums.length && nums[i] > nums[i + 1]){ 
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp; 
                    i = -1;
                }
             
            
        }
    }
}