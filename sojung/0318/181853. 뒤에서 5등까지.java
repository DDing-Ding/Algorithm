// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181853) 

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        for(int num : num_list){
            nums.add(num);
        }
        Collections.sort(nums);

        return nums.subList(0,5).stream().mapToInt(i->i).toArray();
    }
}
