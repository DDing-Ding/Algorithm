// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42587) 

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int value : priorities){
            q.add(value);
        }

        int answer = 0;
        while(true){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == q.peek()){
                    q.poll();
                    answer+=1;
                    if(i == location) return answer;
                }
            }
        }
    }
}
