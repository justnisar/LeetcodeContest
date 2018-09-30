/*
914. X of a Kind in a Deck of Cards
User Accepted: 1886
User Tried: 2278
Total Accepted: 1929
Total Submissions: 6589
Difficulty: Easy
In a deck of cards, each card has an integer written on it.

Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:

Each group has exactly X cards.
All the cards in each group have the same integer.


Example 1:

Input: [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
Example 2:

Input: [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.
Example 3:

Input: [1]
Output: false
Explanation: No possible partition.
Example 4:

Input: [1,1]
Output: true
Explanation: Possible partition [1,1]
Example 5:

Input: [1,1,2,2,2,2]
Output: true
Explanation: Possible partition [1,1],[2,2],[2,2]

Note:

1 <= deck.length <= 10000
0 <= deck[i] < 10000
 */


package contest104;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution1 {
    public int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int number : deck){
            if(map.containsKey(number)){
                map.put(number,map.get(number) + 1);
            }
            else{
                map.put(number,1);
            }
        }

        List<Integer> list = new ArrayList<Integer>(map.values());

        if(list.size() == 0)
            return false;

        int gcd = list.get(0);

        for(int i = 1 ; i < list.size() ; i++){
            gcd = gcd(list.get(i), gcd);
        }

        if(gcd == 1)
            return false;

        return true;

    }
}
