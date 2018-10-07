package contest105;

public class Solution1  {

    public String reverseOnlyLetters(String S) {

        int length = S.length();
        if(length <= 1){
            return S;
        }

        char[] charArray = S.toCharArray();
        boolean[] checkArray = new boolean[charArray.length];
        char[] resultArr = new char[charArray.length];

        for(int i = 0 ; i < charArray.length ; i++){
            char ch = charArray[i];
            if(!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')){
                checkArray[i] = true;
                resultArr[i] = charArray[i];
            }
        }

        int j = 0;
        for(int i = charArray.length - 1 ; i >= 0 ; i--){

            if(checkArray[i] == true){
                continue;
            }
            while(checkArray[j] == true){
                j++;
            }
            resultArr[j] = charArray[i];
            j++;
        }
        return new String(resultArr);
    }
}
