package contest15;

public class Solution2 {

    public void printArray(int[] inputArray){
        for(int number : inputArray){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int[] maxConsecutiveCount = new int[nums.length];
        maxConsecutiveCount[0] = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] == 0){
                maxConsecutiveCount[i] = 0;
            }
            else{
                maxConsecutiveCount[i] = maxConsecutiveCount[i-1] + 1;
            }
        }

        int max = 0;
        int currentMax  = 0;
        for(int i = nums.length - 1 ; i >= 0 ; i--){

            if(nums[i] == 0){
                int result = currentMax + 1 + (i-1 >= 0 ? maxConsecutiveCount[i-1] : 0);
                if(result > max){
                    max = result;
                }
                currentMax = 0;
            }
            else{
                currentMax++;
            }
        }
        return max == 0 ? nums.length : max;
    }

    public static void main(String[] args){
        Solution2 obj = new Solution2();
        int[] inputArray = {1,0,1,1,0,1};
        System.out.println(obj.findMaxConsecutiveOnes(inputArray));
    }
}
