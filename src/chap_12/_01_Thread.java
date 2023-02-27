package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {  // 서로 다른사람이 동시에 하기위해서 쓴다.
    public static void main(String[] args) {
        //  하나의 프로세스, (Process), 하나의 쓰레드가 수행된다.
        //  쓰레드~~(Thread)

//        cleanBySelf();
        // 1 , 3, 5, 사장
        // 2, ,4 , 6  직원

        CleanThread cleanThread = new CleanThread();
//        cleanThread.run(); /// 직원 청소 짝수만
        cleanThread.start(); // 새로운 쓰레드를 만든다.

        cleanByBoss(); // 사장 청소 홀수만
    }

    public static void cleanBySelf(){
        System.out.println("-- 혼자 청소 시작 -- ");
        for (int i = 1; i < 11 ; i++) {
            System.out.println("혼자 " + i + "번방 청소중 ");
        }

        System.out.println("----- 혼자 청 소 끝 ");
    }


    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작 -- ");
        for (int i = 1; i < 11 ; i+=2) {
            System.out.println("사장 " + i + "번방 청소중 ");
        }

        System.out.println("----- 사장 청 소 끝 ");
    }


}
