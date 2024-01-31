// https://school.programmers.co.kr/learn/courses/15008/lessons/121683

import java.util.*;

class Solution {
    public String solution(String input_string) {

        HashMap<Character, Integer> alphabet = new HashMap<>();
        char[] inputs = input_string.toCharArray();
        String answer = "";
        char target = ' ';
        
        for(char input: inputs){
            if(input == target) continue;
            if(alphabet.containsKey(input) && !answer.contains(String.valueOf(input))) answer += input;
            else alphabet.put(input, 1);
            target = input;
        }
        if(answer.equals("")) return "N";
        
        char[] sortAnswer = answer.toCharArray();
        Arrays.sort(sortAnswer);
        return new String(sortAnswer);
      
    }
}
