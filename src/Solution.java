class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        //int j=0;
        // checksum(j);
        for(int j=0;j<nums.length;){
            for(int i=j+1;i<nums.length;i++){
                if(nums[j]+nums[i]==target){
                    result[0]=j;
                    result[1]=i;
                    break;
                }
            }
            j++;
        }
        return result;
    }
}