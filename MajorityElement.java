public class Solution {
    //moore voting method
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int majorElement = nums[0];
        int votesToMajElement = 1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] == majorElement){
                votesToMajElement++;
            }
            else{
                votesToMajElement--;
            }
            
            
            if(votesToMajElement == 0){
                majorElement = nums[i];
                votesToMajElement = 1;
            }
        }
        
        return majorElement;
    }
}
