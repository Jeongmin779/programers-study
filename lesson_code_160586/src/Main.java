import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] keymap = new String[]{"ABACD", "BCEFD"};
        String[] targets = new String[]{"BA"};
        int[] sol = solution(keymap, targets);
        for(int so : sol){
            System.out.println(so);
        }
    }

    public static int[] solution(String[] keymap, String[] targets)
    {
        int[] answer = new int[targets.length];
        Arrays.fill(answer, -1);
        int index = 0;
        for(String target : targets){
            int charIndex = 1000;
            for(char tChar : target.toCharArray()){
                for(String key : keymap){
                    int keyIndex = key.indexOf(tChar);
                    if(keyIndex > -1) {
                        if(charIndex > keyIndex){
                            charIndex = keyIndex + 1;
                        }
                    }
                }

                if(charIndex == 1000){
                    charIndex = -1;
                }

                if(charIndex > 0){
                    if(answer[index] == -1){
                        answer[index] = 0;
                    }
                    answer[index] += charIndex;
                }

                charIndex = 1000;
            }
            index ++;
        }
        return answer;
    }
}