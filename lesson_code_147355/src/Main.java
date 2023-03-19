import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String t = "1";
        String p = "2";
        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        return (int) IntStream.range(0, t.length() - p.length() + 1)
                .filter(i -> Long.parseLong(p) >= Long.parseLong(t.substring(i, i + p.length())))
                .count();
    }
}