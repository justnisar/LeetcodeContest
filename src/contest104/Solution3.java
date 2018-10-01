package contest104;

import java.util.ArrayList;
import java.util.List;

class Solution3 {

    public int[] getCharCount(String str){

        int[] countArray = new int[26];
        for(char ch : str.toCharArray()){
            countArray[ch - 'a']++;
        }
        return countArray;
    }

    public boolean arrayContains(int[] array1,int[] array2){

        for(int i = 0 ; i < 26 ; i++){
            if(array1[i] < array2[i]){
                return false;
            }
        }

        return true;
    }

    public List<String> wordSubsets(String[] A, String[] B) {

        List<String> result = new ArrayList<>();

        int[] maxCharCount = new int[26];

        for(String str : B){
            int[] currentCharCount = getCharCount(str);
            for(int i = 0 ; i < 26 ; i++){
                maxCharCount[i] = Math.max(currentCharCount[i],maxCharCount[i]);
            }
        }

        for(String str : A){
            int[] currentCharCount = getCharCount(str);
            if(arrayContains(currentCharCount,maxCharCount)){
                result.add(str);
            }
        }

        return result;
    }
}