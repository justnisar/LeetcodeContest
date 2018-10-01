/*
896. Monotonic Array
User Accepted: 2111
User Tried: 2152
Total Accepted: 2167
Total Submissions: 3356
Difficulty: Easy
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.



Example 1:

Input: [1,2,2,3]
Output: true
Example 2:

Input: [6,5,4,4]
Output: true
Example 3:

Input: [1,3,2]
Output: false
Example 4:

Input: [1,2,4,5]
Output: true
Example 5:

Input: [1,1,1]
Output: true


Note:

1 <= A.length <= 50000
-100000 <= A[i] <= 100000
 */
package contest100;

class Solution1 {
    public boolean isIncreasing(int[] A){
        for(int i = 1 ; i < A.length ; i++){
            if(A[i-1] > A[i])
                return false;
        }
        return true;
    }

    public boolean isDecreasing(int[] A){
        for(int i = 1 ; i < A.length ; i++){
            if(A[i-1] < A[i])
                return false;
        }
        return true;
    }


    public boolean isMonotonic(int[] A) {

        if(A.length <= 1)
            return true;

        return isIncreasing(A) || isDecreasing(A);

    }
}
