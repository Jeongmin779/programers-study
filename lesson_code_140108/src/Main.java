public class Main {
    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int left;
        int right;
        int string_index = 0;
        int answer = 0;
        while (string_index < s.length()){
            char s_char = s.charAt(string_index);
            left = 1;
            right = 0;
            while (string_index + 1 < s.length() && left != right) {
                string_index++;
                if(s_char == s.charAt(string_index)){
                    left++;
                } else {
                    right++;
                }
            }
            string_index++;
            answer ++;
        }
        return answer;
    }
}