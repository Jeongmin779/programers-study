public class Main {
    public static void main(String[] args) {
        int n = 8;
        int m = 2;
        int[] section = new int[]{2, 6};
        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;
        for(int sec : section){
            if(sec > max){
                answer++;
                max = sec + m - 1;
            }
        }

        return answer;
    }
}