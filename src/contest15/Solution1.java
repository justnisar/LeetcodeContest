package contest15;

public class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length == 0)
            return 0;
        int currentMax = nums[0] == 0 ? 0 : 1;
        int max = currentMax;
        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] == 0){
                currentMax = 0;
            }
            else if(nums[i] == 1 && nums[i-1] == 1){
                currentMax++;
            }
            else if(nums[i] == 1 && nums[i-1] == 0){
                currentMax = 1;
            }

            if(currentMax > max) {
                max = currentMax;
            }
        }
        return max;

    }
}
