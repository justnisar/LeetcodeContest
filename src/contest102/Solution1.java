/*
905. Sort Array By Parity
User Accepted: 2586
User Tried: 2615
Total Accepted: 2646
Total Submissions: 3278
Difficulty: Easy
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
 */
package contest102;

class Solution1 {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];

        int evenIndex = 0;
        int oddIndex = A.length - 1;

        for(int i = 0 ; i < A.length ; i++){
            if(A[i] % 2 == 0){
                result[evenIndex++] = A[i];
            }
            else{
                result[oddIndex--] = A[i];
            }
        }

        return result;

    }
}