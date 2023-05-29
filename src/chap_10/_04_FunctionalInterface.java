package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);
        covertUSD(converter, 2);

        covertUSD((USD) -> System.out.println(USD + " 달려 = " + (USD * 1400)), 2);
        Convertable convertable = (USD) -> System.out.println(USD + " 달려 = " + (USD * 1400));
        covertUSD(convertable,5);


        // 전달값이 하나도 없다면?
        ConvertableWithNoParams c1 = () -> System.out.println("1달려 , 1400");
        c1.convert();


        // 두줄 이상이면?
         c1 = () ->{
             int USD = 15;
             int KRW = 1400;
             System.out.println(USD + " 달려 = " + (USD * KRW));
         } ;
         c1.convert();


         // 전달값 2개
        ConvertableWithTwoParams c2 = (USD, KRW) -> {
            System.out.println(USD + " 달려 = " + (USD * KRW));
        };
        c2.convert(10,1400);


        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d,w) -> d * w;
        int result = c3.convert(4, 1400);
        System.out.println("result = " + result);
    }



    // 마치 메소드 처럼 사용 .  함수형 인터페이스
    public static void covertUSD(Convertable converter, int USD){
        converter.convert(USD);
    }



}
