class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);//특정 위치에 있는 문자를 반환

            if (ch == ' ') {
                sb.append(ch);//SpringBuilder와 append메서드를 사용하면 여러 문자열 조각들을 하나의 문자열로 결합 가능
                continue;
            }

            if (Character.isLowerCase(ch)) { //Character클래스는 char타입의 데이터를 대문자에서 소문자로 변환해줌
                ch = (char) ((ch - 'a' + n) % 26 + 'a');//알파벳 범위를 넘어가는 경우 처리
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}