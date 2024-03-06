import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {
    public String reverseWords(String s) {
        return Arrays.asList(s.split(" ")).reversed().stream().filter(e -> !e.isEmpty()).collect(Collectors.joining(" "));
    }
}
