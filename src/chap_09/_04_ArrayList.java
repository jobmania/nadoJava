package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
//        컬렉션 프레임워크
        ArrayList<String> list = new ArrayList<>();
        list.add("엄준식");
        list.add("유재석");
        list.add("덴지");
        list.add("레넥톤");


        System.out.println();
//        마지막 지우기~
        list.remove(list.size()-1);

        for (String s : list) {
            System.out.println(s);
        }
        //변경
        System.out.println("------------------");
        list.set(0, "양세찬");

        //확인
        System.out.println(list.indexOf("덴지"));

        if(list.contains("레넥톤")){
            System.out.println("포함");
        }else {
            System.out.println("포함 X");
        }

        //전체삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("응");
        }

        list.add("마키마");
        list.add("유재석");
        list.add("덴지");
        list.add("레넥톤");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }


    }
}
