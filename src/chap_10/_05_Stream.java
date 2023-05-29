package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

    public static void main(String[] args) {
        // 1. Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);


        String[] langs = {"python", "java", "c","c++"};
        Stream<String> langStream = Arrays.stream(langs);

        // 2. Collection.stream
        List<String> langList = Arrays.asList("python", "java", "c", "c++");
        Stream<String> langListStream = langList.stream();

        // 3. Stream.of()
        Stream<String> streamList = Stream.of("python", "java", "c", "c++");



        // 스트림사용 ㄱㄱㄱ
        // 중간연산(Intermediate Operation) : filter,
        // 최종연산(Terminal Operation)
    }
}
