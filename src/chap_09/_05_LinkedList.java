package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("마키마");
        list.add("유재석");
        list.add("덴지");
        list.add("레넥톤");

//        조회
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("---------------");
//          추가
        list.addFirst("서장미");
        for (String s : list) {
            System.out.println(s);
        }

        list.add(1, "파워쨩");
        System.out.println(list.get(1)); // 하나씩 밀림
        System.out.println(list.get(2));

        //삭제
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());

        // 변경
        list.set(0, "아키");
    }
}
