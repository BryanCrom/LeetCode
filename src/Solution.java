import java.util.*;

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char letter: s.toCharArray()){
            freq[(int)letter - 97]++;
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for(int num: freq){
            if(num % 2 == 0 && num != 0){
                minEven = Math.min(minEven, num);
            }
            else{
                maxOdd = Math.max(maxOdd, num);
            }
        }
        return maxOdd - minEven;
    }
}