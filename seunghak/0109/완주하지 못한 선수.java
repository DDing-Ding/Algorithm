import java.util.HashMap;
//import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //해시맵을 사용하면 배열을 정렬할 필요 없이 빠르게 참가자와 완주자를 비교 -> 시간초과 이슈로 HashMap사용
        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
            if (map.get(player) == 0) {
                map.remove(player);
            }
        }

        for (String key : map.keySet()) {
            return key;
        }
        return null;
    }
}

//시관초과 코드
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        int i;
//        for (i = 0; i < completion.length; i++) {
//            if (!participant[i].equals(completion[i])) {
//                return participant[i];
//            }
//        }
//
//        return participant[i];
//    }
//}