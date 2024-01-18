// [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/43165) 

class Solution {
    int[] numbers;
    int target;
    int answer;

    private void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);
        return answer;
    }
}
