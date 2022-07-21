class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2]; 
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int rest = target - nums[i]; 
                if (nums[j]==rest){
                    output[0] = i;
                    output[1] = j;
                }        
            }
        }
        return output;
    }
}
