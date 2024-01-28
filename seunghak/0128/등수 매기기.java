import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] expectedRanks = new int[N];

        for (int i = 0; i < N; i++) {
            expectedRanks[i] = scanner.nextInt();
        }

        Arrays.sort(expectedRanks);//오름차순 정렬

        long dissatisfaction = 0;
        for (int i = 0; i < N; i++) {
            //Math.abs함수 -> 괄호 안의 절대값을 계산
            dissatisfaction += Math.abs(expectedRanks[i] - (i + 1));
        }

        System.out.println(dissatisfaction);
    }
}