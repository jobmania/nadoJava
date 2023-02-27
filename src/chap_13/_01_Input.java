package chap_13;

import java.util.Scanner;

public class _01_Input {

    public static void main(String[] args) {
//        상요자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("입력");
//        String name = sc.next();
//        System.out.println("피 입력");
//        String blood = sc.next();
//        System.out.println("키 입력");
//        int height = Integer.parseInt(sc.next());
//        System.out.println("정수 입력");
//        int height2 = sc.nextInt();
////        double weight = Double.parseDouble(sc.next());
//        System.out.println("몸무게");
//        double weight =sc.nextDouble();
//
//        System.out.println("입력");
//        System.out.println(name);
//        System.out.println("blood = " + blood);
//        System.out.println("height = " + height);
//        System.out.println("weight = " + weight);


        System.out.println("프");
        String langg = sc.next();  // 한단어
//        String langg = sc.nextLine();
        System.out.println("langg = " + langg);

        sc.nextLine();// 불필요한 문장삭제


        System.out.println("기");
        String next = sc.nextLine();  // 한문장 ...
        System.out.println("next = " + next);


    }
}
