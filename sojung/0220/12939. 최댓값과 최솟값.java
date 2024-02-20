// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12939)

class Solution {
    public String solution(String s) {

        String[] nums = s.split(" ");
        int max = Integer.parseInt(nums[0]);
        int min = Integer.parseInt(nums[0]);

        for(String stringNum : nums){
            int num = Integer.parseInt(stringNum);
            if(num > max) max = num;
            if(num < min) min = num;
        }

        return min + " " + max;
    }
}
