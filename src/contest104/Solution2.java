/*
915. Partition Array into Disjoint Intervals
User Accepted: 1501
User Tried: 1874
Total Accepted: 1525
Total Submissions: 4281
Difficulty: Medium
Given an array A, partition it into two (contiguous) subarrays left and right so that:

Every element in left is less than or equal to every element in right.
left and right are non-empty.
left has the smallest possible size.
Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.



Example 1:

Input: [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
Example 2:

Input: [1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]


Note:

2 <= A.length <= 30000
0 <= A[i] <= 10^6
It is guaranteed there is at least one way to partition A as described.
 */
package contest104;

class Solution2 {
    public int partitionDisjoint(int[] A) {

        int[] max_A = new int[A.length];
        int[] min_A = new int[A.length];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < A.length ; i++){

            if(A[i] > max){
                max = A[i];
            }
            max_A[i] = max;
            if(A[A.length - 1 - i] < min){
                min = A[A.length - 1 - i];
            }
            min_A[A.length - 1 - i] = min;
        }

        for(int i = 0; i < A.length - 1 ; i++){
            if(max_A[i] <= min_A[i+1])
                return i+1;
        }

        return 0;
    }
}
