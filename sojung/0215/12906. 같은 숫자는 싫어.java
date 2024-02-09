// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12906) 

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();
        Integer target = -1;
        for(int value : arr){
            if(target != value) answer.add(value);
            target = value;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
