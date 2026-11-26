
class Solution {
    public int singleNumber(int[] nums) {
          Map<Integer, Integer> scores = new HashMap<>();
          for(int i = 0 ; i< nums.length; i++){ 
            scores.put(nums[i] , scores.getOrDefault(nums[i], 0) + 1 );
          }
          Integer n = 0;
        for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
          
        
      
    
    }   
    
};