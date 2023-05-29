package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

    public static void main(String[] args) {
        // 1. Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);


        String[] langs = {"python", "java", "c","c++","c#", "javascript"};
        Stream<String> langStream = Arrays.stream(langs);

        // 2. Collection.stream
        List<String> langList = Arrays.asList("python", "java", "c","c++","c#", "javascript");
        Stream<String> langListStream = langList.stream();

        // 3. Stream.of()
        Stream<String> streamList = Stream.of("python", "java", "c", "c++");



        // 스트림사용 ㄱㄱㄱ
        // 중간연산(Intermediate Operation) : filter, map sorted distinct, skip ......
        // 최종연산(Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch


        // 90 이상 출력
//        Arrays.stream(scores).filter(x -> x >= 90).forEach( x -> System.out.println(x));
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("-=-----------------------------------");

        // 90 이상  갯수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println("count = " + count);
        System.out.println("-=-----------------------------------");

        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println("sum = " + sum);

        System.out.println("-=-----------------------------------");

        // 정렬 후 출력
       Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-=-----------------------------------");


       // c 로 시작하는 것만 추출
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-=-----------------------------------");

        //java 라는 글자를 포함한 글자만
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-=-----------------------------------");

        // 4글자 이하 언어 정렬 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);

        System.out.println("-=-----------------------------------");


        //4글자 이하언어, c 포함한 언어만 출력
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .sorted()
                .forEach(System.out::println);
        System.out.println("-=-----------------------------------");

        //4글자 이하언어, c 포함한 언어중 하나라도 있는지 출력 / anyMatch 출력값 boolean
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-=-----------------------------------");

        // 4글자 모두 c 포함하는 지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 3)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);

        System.out.println("-=-----------------------------------");

        // 4글자 이하 언어중 c 라는 언어 포함하면 (어려워요) 글자를 함꼐 출력
        // map :
        langList.stream()
                .filter(x -> x.length() <= 3)
                .filter(x -> x.contains("c"))
                .map(x -> x + " 어려워요")
                .forEach(System.out::println);
        System.out.println("-=-----------------------------------");
        // c 라는 언어 포함하면 (어려워요) 대문자로 변환
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        // c 라는 언어 포함하면 (어려워요) 대문자로 변경하여 리스트로 저장..
        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartWithC.forEach(System.out::println);

        // 스트림은 한번 가공하면 재사용이 불가능하다!

    }
}
