import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        int [] num = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(num).min().getAsInt() + " " + Arrays.stream(num).max().getAsInt();
    }
}