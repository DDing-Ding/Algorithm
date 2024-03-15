// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12909) 

class Solution {
    boolean solution(String s) {

        String[] strings = s.split("");
        int sum = 0;
        for(String str : strings){
            if(sum<0) return false;
            if(str.equals("(")) sum += 1;
            else sum -= 1;
        }
        if(sum == 0) return true;
        else return false;

    }
}
