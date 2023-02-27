package chap_13;

public class _02_OutPut {
    public static void main(String[] args) {


        System.out.println("=================");

        System.out.printf("%d%n",1 );  // %d는 정수.
        System.out.printf("%d %d %d %d%n  ",1 ,2,3,4);
        System.out.printf("%d %d %d %d%n  ",1123 ,4442,3,4);
        System.out.printf("%6d%n",1123 );  // __1234, 6자리 공간 확보
        System.out.printf("%06d%n",1234);  // 001234, 6자리 확보후 빈공간은 0을 채ㅜㄴ다
        System.out.printf("%6d%n",-1234);  // _-1234,
        System.out.printf("%+6d%n",1234);  // _+1234, (항상 +기호표시)
        System.out.printf("%,15d%n", 100000000); //100,000,000
        System.out.printf("%-6d%n", 1234); //1234__  왼쪽 정렬

        System.out.println("--------- 실수 -----------");
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI); // 3.14
        System.out.printf("%6.2f%n", Math.PI); // __3.14
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14


        System.out.println("----------- 문자열 -------------");
        System.out.printf("%s%n", "Java");  //JAVA
        System.out.printf("%6s%n", "Java");  //__JAVA 우측 정렬
        System.out.printf("%-6s%n", "Java");  //JAVA__ 좌측 정렬
        System.out.printf("%6.2s%n", "Java");  //____JA 6공간, 2글자 출력
        System.out.printf("%-6.2s%n", "Java");  //JA____ 6공간, 2글자 출력

        System.out.println("-----------응용-------------");
        System.out.println("이름 영어 수학 평균");
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호",90,80,80.5);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수",92,80,80.5);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅",91,80,80.5);
        System.out.printf("%-6s %4d %4d %6.1f%n", "윤태섭",90,80,80.5);


        System.out.println("참고");
        System.out.println("ABCEFG");
        System.out.println("가나다라마바사");

    }
}
