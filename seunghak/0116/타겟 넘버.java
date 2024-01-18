class Solution {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }

    //DFS를 사용해 모든 가능한 덧셈 및 뺄셈 조합 탐색
    private void dfs(int[] numbers, int index, int sum, int target) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, index + 1, sum + numbers[index], target); // 현재 숫자를 더하는 경우
        dfs(numbers, index + 1, sum - numbers[index], target); // 현재 숫자를 빼는 경우
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int result = solution.solution(numbers, target);
        System.out.println("타겟 경우의 수: " + result);
    }
}