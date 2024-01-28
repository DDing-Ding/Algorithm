import java.util.*;

class Solution {
    public String solution(String input_string) {
        List<String> answer = new ArrayList<>();
        String temp = "";
        String check = "";

        for (String s : input_string.split("")) {
            if (temp.equals(s)) continue;
            temp = s;

            if (!check.contains(s))
                check += s;
            else if (!answer.contains(s))
                answer.add(s);
        }

        Collections.sort(answer);
        return answer.size() == 0 ? "N" : String.join("", answer);
    }
}