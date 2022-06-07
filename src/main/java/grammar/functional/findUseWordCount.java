package grammar.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class findUseWordCount {

    static Stream<MatchResult> getMatcherStream(String line, String pattern) {
        return Pattern.compile(pattern).matcher(line).results();
    }

    public static void main(String[] args) {
        try {
            TreeMap<String,Integer> freq = new TreeMap<>();
            Stream<String> lines = Files.lines(Paths.get("/Users/junghyunkang/Downloads/list.txt"));
            lines.forEach(line -> {
                getMatcherStream(line,"\\w+").forEach(o -> freq.put(o.group(),freq.getOrDefault(o.group(),0)+1));
            });
            System.out.println("freq = " + freq);
            System.out.println("freq.size() = " + freq.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
