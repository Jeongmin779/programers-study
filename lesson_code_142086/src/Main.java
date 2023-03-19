import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int index = 0;
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        for(char c : s.toCharArray()) {
            for(int i = index; i >= 0 ; i--){
                if(s.charAt(i) == c && index - i != 0){
                    answer[index] = index - i;
                    break;
                } else {
                    answer[index] = -1;
                }
            }
            index ++;
        }
        return answer;
    }
}