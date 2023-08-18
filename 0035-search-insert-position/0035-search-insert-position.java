class Solution {
    public int searchInsert(int[] nums, int target) {
        int r=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                k++;
                return i;

            }
            else if(target>nums[i]){
                r++;
            }
           
        }
       

        
               return r;
    }
}